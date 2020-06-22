package com.wf.shardingsphere;

import org.apache.shardingsphere.shardingjdbc.spring.boot.SpringBootConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author ：wf
 * @Date ：2020/6/2 13:15
 * @Describe：数据脱敏
 */
@SpringBootApplication(exclude = SpringBootConfiguration.class)
public class EncryptorApplication {
    public static void main(String[] args) {
        SpringApplication.run(EncryptorApplication.class);
    }
}
