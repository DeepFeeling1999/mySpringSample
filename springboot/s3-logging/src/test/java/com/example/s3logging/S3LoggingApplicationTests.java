package com.example.s3logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class S3LoggingApplicationTests {
    Logger logger = (Logger) LoggerFactory.getLogger(getClass());


    @Test
    void contextLoads() {
        //日志级别，由低到高
        logger.trace("这是trace日志");
        logger.debug("这是debug日志");
        //默认是info级别
        logger.info("这是info信息");
        logger.warn("这是warn日志");
        logger.error("这是error日志");
    }
}
