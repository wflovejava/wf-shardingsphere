package com.wf.shardingsphere;

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
public class ShardingsphereApplication {
    private static Logger log = LoggerFactory.getLogger(ShardingsphereApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ShardingsphereApplication.class);
        log.info("================= services start success =================");

    }
}
