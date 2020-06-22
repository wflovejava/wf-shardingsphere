package com.wf.shardingsphere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author ：wf
 * @Date ：2020/6/2 13:31
 * @Describe：多租户实现方案
 */
@SpringBootApplication
@MapperScan("com.wf.shardingsphere.dao")
public class TenantApplication {
    public static void main(String[] args) {
        SpringApplication.run(TenantApplication.class);
    }
}
