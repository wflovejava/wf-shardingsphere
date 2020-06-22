package com.wf.shardingsphere.service.impl;

import com.wf.shardingsphere.entity.SysUserCommon;
import com.wf.shardingsphere.dao.SysUserCommonDao;
import com.wf.shardingsphere.service.SysUserCommonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 系统用户表(SysUserCommon)表服务实现类
 *
 * @author makejava
 * @since 2020-06-02 15:27:49
 */
@Service("sysUserCommonService")
public class SysUserCommonServiceImpl implements SysUserCommonService {
    @Resource
    private SysUserCommonDao sysUserCommonDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysUserCommon queryById(Long id) {
        return this.sysUserCommonDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysUserCommon> queryAllByLimit(int offset, int limit) {
        return this.sysUserCommonDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysUserCommon 实例对象
     * @return 实例对象
     */
    @Override
    public SysUserCommon insert(SysUserCommon sysUserCommon) {
        this.sysUserCommonDao.insert(sysUserCommon);
        return sysUserCommon;
    }

    /**
     * 修改数据
     *
     * @param sysUserCommon 实例对象
     * @return 实例对象
     */
    @Override
    public SysUserCommon update(SysUserCommon sysUserCommon) {
        this.sysUserCommonDao.update(sysUserCommon);
        return this.queryById(sysUserCommon.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.sysUserCommonDao.deleteById(id) > 0;
    }

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public List<SysUserCommon> queryAll(SysUserCommon sysUserCommon) {
        return this.sysUserCommonDao.queryAll(sysUserCommon);
    }
}