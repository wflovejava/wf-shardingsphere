import com.wf.shardingsphere.idgen.SnowFlake;
import com.wf.shardingsphere.entity.InfoobjectHistory;
import com.wf.shardingsphere.service.InfoobjectHistoryService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import com.wf.shardingsphere.ShardingsphereSubDBTableApplication;

import java.util.Date;

/**
 * @Author ：wf
 * @Date ：2020/5/28 13:57
 * @Describe：读写分离测试
 */
@RunWith(SpringRunner.class)
@ActiveProfiles
@SpringBootTest(classes = ShardingsphereSubDBTableApplication.class)
public class SubDBTableTest {
    @Autowired
    InfoobjectHistoryService infoobjectHistoryService;


    /**
     * 测试个数
     */
    @org.junit.Test
    public void testcount(){
        int count = infoobjectHistoryService.count();
        System.out.println(" 测试个数: "+count);
    }

    /**
     * 测试读
     */
    @org.junit.Test
    public void testread(){
        infoobjectHistoryService.queryById(145L);
    }


    /**
     * 测试写
     */
    @org.junit.Test
    public void testwrite(){
        SnowFlake snowFlake = new SnowFlake(1L, 1L);

        for(int i=0;i<1000;i++){
            InfoobjectHistory infoobjectHistory = new InfoobjectHistory();
            infoobjectHistory.setTenantId(Long.parseLong(i+1+""));
            infoobjectHistory.setObjectId(Long.parseLong(i+""));
            infoobjectHistory.setPropertyId(Long.parseLong(i+""));
            infoobjectHistory.setCreateTime(new Date());
            long id = snowFlake.nextId();
            infoobjectHistory.setId(i+1L);
           // System.out.println(id);

           infoobjectHistoryService.insert(infoobjectHistory);
        }
    }


}
