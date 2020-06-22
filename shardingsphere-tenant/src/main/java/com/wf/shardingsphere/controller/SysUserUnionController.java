package com.wf.shardingsphere.controller;

import com.wf.shardingsphere.entity.SysUserUnion;
import com.wf.shardingsphere.service.SysUserUnionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 系统用户表union(SysUserUnion)表控制层
 *
 * @author makejava
 * @since 2020-06-02 15:28:12
 */
@RestController
@RequestMapping("sysUserUnion")
public class SysUserUnionController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserUnionService sysUserUnionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysUserUnion selectOne(Long id) {
        return this.sysUserUnionService.queryById(id);
    }

}