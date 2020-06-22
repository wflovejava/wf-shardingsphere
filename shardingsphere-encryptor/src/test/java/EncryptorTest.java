
import com.wf.shardingsphere.EncryptorApplication;
import com.wf.shardingsphere.entity.InfoobjectHistory;
import com.wf.shardingsphere.service.InfoobjectHistoryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@ActiveProfiles
@SpringBootTest(classes = EncryptorApplication.class)
class EncryptorTest {

    @Autowired
    InfoobjectHistoryService infoobjectHistoryService;

    /**
     * 测试读
     */
    @Test
    public void testread(){
        infoobjectHistoryService.queryById(145L);
    }


    /**
     * 测试写
     */
    @Test
    public void testwrite(){
        for(int i=0;i<5;i++){
            InfoobjectHistory infoobjectHistory = new InfoobjectHistory();
            infoobjectHistory.setTenantId(Long.parseLong(i+1+""));
            infoobjectHistory.setObjectId(Long.parseLong(i+""));
            infoobjectHistory.setPropertyId(Long.parseLong(i+""));
            infoobjectHistory.setCreateTime(new Date());

            infoobjectHistoryService.insert(infoobjectHistory);
        }
    }

}