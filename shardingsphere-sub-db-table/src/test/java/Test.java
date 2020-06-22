import com.wf.shardingsphere.entity.InfoobjectHistory;
import com.wf.shardingsphere.idgen.SnowFlake;

import java.util.Date;

/**
 * @Author ：wf
 * @Date ：2020/5/29 9:55
 * @Describe：
 */
public class Test {
    public static void main(String[] args) {
        SnowFlake snowFlake = new SnowFlake(1L, 1L);

        for(int i=0;i<1000;i++) {
            long id = snowFlake.nextId();
            System.out.println(id);
        }
    }

    @org.junit.Test
    public void test(){
        SnowFlake snowFlake = new SnowFlake(1L, 1L);

        for(int i=0;i<10000;i++){
            InfoobjectHistory infoobjectHistory = new InfoobjectHistory();
            infoobjectHistory.setTenantId(Long.parseLong(i+1+""));
            infoobjectHistory.setObjectId(Long.parseLong(i+""));
            infoobjectHistory.setPropertyId(Long.parseLong(i+""));
            infoobjectHistory.setCreateTime(new Date());
            long id = snowFlake.nextId();
            infoobjectHistory.setId(id);
            System.out.println(id);

            //infoobjectHistoryService.insert(infoobjectHistory);
        }
    }
}
