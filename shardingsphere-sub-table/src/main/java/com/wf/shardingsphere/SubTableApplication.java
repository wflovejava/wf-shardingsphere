package com.wf.shardingsphere;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author ：wf
 * @Date ：2020/6/2 11:45
 * @Describe：同库分表
 */
@SpringBootApplication
public class SubTableApplication {
    private static Logger log = LoggerFactory.getLogger(SubTableApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SubTableApplication.class);
        log.info("================= services start success =================");

    }
}
