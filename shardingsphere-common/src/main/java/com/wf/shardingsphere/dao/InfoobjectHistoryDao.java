package com.wf.shardingsphere.dao;

import com.wf.shardingsphere.entity.InfoobjectHistory;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (InfoobjectHistory)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-28 11:29:01
 */
public interface InfoobjectHistoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    InfoobjectHistory queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InfoobjectHistory> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param infoobjectHistory 实例对象
     * @return 对象列表
     */
    List<InfoobjectHistory> queryAll(InfoobjectHistory infoobjectHistory);

    /**
     * 新增数据
     *
     * @param infoobjectHistory 实例对象
     * @return 影响行数
     */
    int insert(InfoobjectHistory infoobjectHistory);

    /**
     * 修改数据
     *
     * @param infoobjectHistory 实例对象
     * @return 影响行数
     */
    int update(InfoobjectHistory infoobjectHistory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);


    /**
     * 个数
     * @return
     */
    int count();

}