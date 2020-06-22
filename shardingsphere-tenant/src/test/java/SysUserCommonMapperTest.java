
import com.wf.shardingsphere.TenantApplication;
import com.wf.shardingsphere.entity.SysUserCommon;
import com.wf.shardingsphere.service.SysUserCommonService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * 批量新增公共数据(sys_user_common)测试
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TenantApplication.class)
public class SysUserCommonMapperTest {

    @Autowired
    private SysUserCommonService sysUserCommonService;

    /**
     *测试广播表保存
     */
    @Test
    public void saveCommonTest(){


        for (int i = 0; i <10 ; i++) {
            sysUserCommonService.insert(initSysCommon());
        }


    }

    public SysUserCommon initSysCommon(){
        SysUserCommon sysUserCommon=new SysUserCommon();
        sysUserCommon.setCreateTime(new Date());
        sysUserCommon.setCreateUser("sys");
        sysUserCommon.setUserName("user_name"+ new Random().nextInt(10));
        return sysUserCommon;
    }

    /**
     * 测试单表查询
     */
    @Test
    public void testSelect(){
        List<SysUserCommon> sysUserCommons = sysUserCommonService.queryAll(null);

    }



}
