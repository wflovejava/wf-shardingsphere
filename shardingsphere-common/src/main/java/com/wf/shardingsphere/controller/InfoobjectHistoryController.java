package com.wf.shardingsphere.controller;

import com.wf.shardingsphere.entity.InfoobjectHistory;
import com.wf.shardingsphere.service.InfoobjectHistoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (InfoobjectHistory)表控制层
 *
 * @author makejava
 * @since 2020-05-28 11:29:03
 */
@RestController
@RequestMapping("infoobjectHistory")
public class InfoobjectHistoryController {
    /**
     * 服务对象
     */
    @Resource
    private InfoobjectHistoryService infoobjectHistoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public InfoobjectHistory selectOne(Long id) {
        return this.infoobjectHistoryService.queryById(id);
    }

}