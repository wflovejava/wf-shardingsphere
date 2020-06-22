package com.wf.shardingsphere;

import org.apache.shardingsphere.shardingjdbc.spring.boot.SpringBootConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author ：wf
 * @Date ：2020/6/2 10:17
 * @Describe： 分库分表 读写分离
 */
@SpringBootApplication(exclude = SpringBootConfiguration.class)
@MapperScan("com.wf.shardingsphere.dao")
public class SubDbTableReadWriteApplication {
    private static Logger log = LoggerFactory.getLogger(SubDbTableReadWriteApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SubDbTableReadWriteApplication.class);
        log.info("================= services start success =================");

    }

}
