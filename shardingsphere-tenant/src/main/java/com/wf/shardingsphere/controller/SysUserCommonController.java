package com.wf.shardingsphere.controller;

import com.wf.shardingsphere.entity.SysUserCommon;
import com.wf.shardingsphere.service.SysUserCommonService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 系统用户表(SysUserCommon)表控制层
 *
 * @author makejava
 * @since 2020-06-02 15:27:49
 */
@RestController
@RequestMapping("sysUserCommon")
public class SysUserCommonController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserCommonService sysUserCommonService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysUserCommon selectOne(Long id) {
        return this.sysUserCommonService.queryById(id);
    }

}