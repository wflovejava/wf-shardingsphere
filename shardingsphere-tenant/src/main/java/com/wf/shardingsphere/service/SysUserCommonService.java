package com.wf.shardingsphere.service;

import com.wf.shardingsphere.entity.SysUserCommon;
import java.util.List;

/**
 * 系统用户表(SysUserCommon)表服务接口
 *
 * @author makejava
 * @since 2020-06-02 15:27:49
 */
public interface SysUserCommonService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysUserCommon queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysUserCommon> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysUserCommon 实例对象
     * @return 实例对象
     */
    SysUserCommon insert(SysUserCommon sysUserCommon);

    /**
     * 修改数据
     *
     * @param sysUserCommon 实例对象
     * @return 实例对象
     */
    SysUserCommon update(SysUserCommon sysUserCommon);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    List<SysUserCommon> queryAll(SysUserCommon sysUserCommon);

}