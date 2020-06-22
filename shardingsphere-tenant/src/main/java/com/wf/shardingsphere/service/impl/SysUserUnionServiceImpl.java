package com.wf.shardingsphere.service.impl;

import com.wf.shardingsphere.entity.SysUserUnion;
import com.wf.shardingsphere.dao.SysUserUnionDao;
import com.wf.shardingsphere.service.SysUserUnionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 系统用户表union(SysUserUnion)表服务实现类
 *
 * @author makejava
 * @since 2020-06-02 15:28:12
 */
@Service("sysUserUnionService")
public class SysUserUnionServiceImpl implements SysUserUnionService {
    @Resource
    private SysUserUnionDao sysUserUnionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysUserUnion queryById(Long id) {
        return this.sysUserUnionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysUserUnion> queryAllByLimit(int offset, int limit) {
        return this.sysUserUnionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysUserUnion 实例对象
     * @return 实例对象
     */
    @Override
    public SysUserUnion insert(SysUserUnion sysUserUnion) {
        this.sysUserUnionDao.insert(sysUserUnion);
        return sysUserUnion;
    }

    /**
     * 修改数据
     *
     * @param sysUserUnion 实例对象
     * @return 实例对象
     */
    @Override
    public SysUserUnion update(SysUserUnion sysUserUnion) {
        this.sysUserUnionDao.update(sysUserUnion);
        return this.queryById(sysUserUnion.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.sysUserUnionDao.deleteById(id) > 0;
    }
}