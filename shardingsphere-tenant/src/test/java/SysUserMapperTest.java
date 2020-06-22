
import com.wf.shardingsphere.TenantApplication;
import com.wf.shardingsphere.dao.SysUserDao;
import com.wf.shardingsphere.entity.SysUser;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 验证业务表（分库表关联平台表） 关联公共表
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TenantApplication.class)
public class SysUserMapperTest {

    @Autowired
    SysUserDao sysUserDao;

//    @Test
//    public void getUserUnionCommonTest(){
//        SysUser unionCommon = sysUserMapper.getUserUnionCommon("fwcloud0",1L);
//        log.info(JSONUtil.toJsonStr(unionCommon));
//        System.out.println("ok");
//    }

    /**
     *  验证绑定表关联公共表的查询
     *  结果可以看到是不允许这么操作，应为已经跨数据源查询了（我们已经指定了广播表所在的数据源了）
     */
    @Test
    public void getUserUnionCommonByTenantTest(){
        SysUser unionCommon = sysUserDao.getUserUnionCommonByTenant("fwcloud0","adidas");
         System.out.println("ok");
    }


    /**
     *  验证绑定表关联公共表的查询
     */
    @Test
    public void getUserUnionByUserNameTest(){
        long start = System.currentTimeMillis();
        SysUser unionCommon = sysUserDao.getUserUnionByUserName("fwcloud0","adidas");

        long end = System.currentTimeMillis();
        System.out.println("time:"+(end-start));
    }

    /**
     * 根据用户名查询关联广播表的查询测试
     * 结果可以看到是不允许这么操作，应为已经跨数据源查询了（我们已经指定了广播表所在的数据源了）
     */
    @Test
    public void getUserUnionCommonTest(){
        SysUser unionCommon = sysUserDao.getUserUnionCommon("fwcloud0",1L);
         System.out.println("ok");
    }
}