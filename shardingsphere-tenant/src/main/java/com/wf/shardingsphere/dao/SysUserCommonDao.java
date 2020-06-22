package com.wf.shardingsphere.dao;

import com.wf.shardingsphere.entity.SysUserCommon;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 系统用户表(SysUserCommon)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-02 15:27:49
 */
public interface SysUserCommonDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysUserCommon queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysUserCommon> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysUserCommon 实例对象
     * @return 对象列表
     */
    List<SysUserCommon> queryAll(SysUserCommon sysUserCommon);

    /**
     * 新增数据
     *
     * @param sysUserCommon 实例对象
     * @return 影响行数
     */
    int insert(SysUserCommon sysUserCommon);

    /**
     * 修改数据
     *
     * @param sysUserCommon 实例对象
     * @return 影响行数
     */
    int update(SysUserCommon sysUserCommon);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}