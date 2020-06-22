package com.wf.shardingsphere.controller;

import com.wf.shardingsphere.entity.SysUser;
import com.wf.shardingsphere.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 系统用户表(SysUser)表控制层
 *
 * @author makejava
 * @since 2020-06-02 14:17:07
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysUser selectOne(Long id) {
        return this.sysUserService.queryById(id);
    }

}