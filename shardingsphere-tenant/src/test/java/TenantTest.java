import com.google.common.collect.Lists;
import com.wf.shardingsphere.TenantApplication;
import com.wf.shardingsphere.entity.SysUser;
import com.wf.shardingsphere.service.SysUserService;
import org.assertj.core.util.DateUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @Author ：wf
 * @Date ：2020/6/2 14:09
 * @Describe： 多租户分组
 *
 */
@RunWith(SpringRunner.class)
@ActiveProfiles
@SpringBootTest(classes = TenantApplication.class)
public class TenantTest {

    @Autowired
    SysUserService sysUserService;
    @Test
    public void testBatch(){

        List<String> tenantList = Lists.newArrayList("1", "2", "3");
        List<SysUser> list=new ArrayList<>();
        for (int i = 0; i <100 ; i++) {


            SysUser sysUser=new SysUser();
            sysUser.setAvatar("/home/avatar");
            sysUser.setCreateTime(new Date());
            sysUser.setCreateUser("sys"+i);
            sysUser.setDeleteFlag(0);
            sysUser.setDeptCode("depe"+i);
            sysUser.setDisableFlag(0);
            sysUser.setEmail("***@123.com"+i);
            sysUser.setPassword("123456");
            sysUser.setPosCode("pos");
            sysUser.setRealName("realname"+i);
            sysUser.setUpdateTime(new Date());
            sysUser.setUserName("fwcloud"+i);
            sysUser.setUpdateUser("sys"+i);
            sysUser.setUserPhone("12345678912"+i);
            sysUser.setTenant(tenantList.get(new Random().nextInt(tenantList.size())));
            list.add(sysUser);
        }

          sysUserService.insertBatch(list);

    }
}
