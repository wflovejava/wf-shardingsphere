package com.wf.shardingsphere;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author ：wf
 * @Date ：2020/6/2 9:25
 * @Describe：分库分表读写分离
 */
@SpringBootApplication(exclude = SpringBootConfiguration.class)

public class SubDbTableReadWriteApplication {
    private static Logger log = LoggerFactory.getLogger(SubDbTableReadWriteApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SubDbTableReadWriteApplication.class);
        log.info("================= services start success =================");

    }
}
