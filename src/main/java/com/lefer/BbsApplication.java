package com.lefer;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@Transactional
@ServletComponentScan(value="com.lefer.filter")
public class BbsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BbsApplication.class, args);
        LoggerFactory.getLogger(BbsApplication.class).info("启动成功！");
    }
}
