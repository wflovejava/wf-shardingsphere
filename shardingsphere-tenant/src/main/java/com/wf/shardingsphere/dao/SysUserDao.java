package com.wf.shardingsphere.dao;

import com.wf.shardingsphere.entity.SysUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 系统用户表(SysUser)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-02 14:17:05
 */
public interface SysUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysUser queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysUser 实例对象
     * @return 对象列表
     */
    List<SysUser> queryAll(SysUser sysUser);

    /**
     * 新增数据
     *
     * @param sysUser 实例对象
     * @return 影响行数
     */
    int insert(SysUser sysUser);

    /**
     * 修改数据
     *
     * @param sysUser 实例对象
     * @return 影响行数
     */
    int update(SysUser sysUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 自定义批量插入
     * @param sysUsers
     * @return
     */
    int  insertBatch(List<SysUser> sysUsers);

    /**
     * 根据用户名查询关联广播表的查询测试
     * @param username
     * @return
     */
    SysUser getUserUnionCommonByTenant(@Param("username") String username,@Param("tenant") String tenant);

    /**
     * 根据用户名仅测试关联查询
     * @param username
     * @return
     */
    SysUser getUserUnionByUserName(@Param("username") String username,@Param("tenant") String tenant);


    /**
     * 根据用户名查询关联广播表的查询测试
     * @param username
     * @return
     */
    SysUser getUserUnionCommon(@Param("username") String username,@Param("id") Long id);

}