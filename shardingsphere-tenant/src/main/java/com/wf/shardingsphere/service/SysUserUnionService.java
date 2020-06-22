package com.wf.shardingsphere.service;

import com.wf.shardingsphere.entity.SysUserUnion;
import java.util.List;

/**
 * 系统用户表union(SysUserUnion)表服务接口
 *
 * @author makejava
 * @since 2020-06-02 15:28:12
 */
public interface SysUserUnionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysUserUnion queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysUserUnion> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysUserUnion 实例对象
     * @return 实例对象
     */
    SysUserUnion insert(SysUserUnion sysUserUnion);

    /**
     * 修改数据
     *
     * @param sysUserUnion 实例对象
     * @return 实例对象
     */
    SysUserUnion update(SysUserUnion sysUserUnion);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}