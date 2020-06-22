package com.wf.shardingsphere.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author ：wf
 * @Date ：2020/5/28 13:52
 * @Describe：
 */
@Configuration
@MapperScan(value = "com.wf.shardingsphere.dao")
public class MybatisPlusConfig {
}
