package com.wf.shardingsphere;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author ：wf
 * @Date ：2020/5/28 10:45
 * @Describe：启动服务
 */
@SpringBootApplication
@MapperScan("com.wf.shardingsphere.dao")
public class ShardingsphereReadWriteApplication {
    private static Logger log = LoggerFactory.getLogger(ShardingsphereReadWriteApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ShardingsphereReadWriteApplication.class);
        log.info("================= services start success =================");

    }
}
