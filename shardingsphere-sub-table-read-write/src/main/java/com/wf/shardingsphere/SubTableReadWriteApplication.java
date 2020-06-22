package com.wf.shardingsphere;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author ：wf
 * @Date ：2020/6/2 11:51
 * @Describe：同库分表读写分离
 */
@SpringBootApplication
public class SubTableReadWriteApplication {
    private static Logger log = LoggerFactory.getLogger(SubTableReadWriteApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SubTableReadWriteApplication.class);
        log.info("================= services start success =================");

    }
}
