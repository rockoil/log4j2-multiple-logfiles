package com.hakine;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

import java.io.IOException;


/**
 * Created by rockoil@gmail.com on 20. 7. 21.
 * Blog : http://ioioi.dev
 * Github : http://github.com/ioioi-dev
 */
public class App {

    static final Logger logger = LogManager.getLogger(App.class);

    /**
     * 메인 부분
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        /**
         * Test1에 대한 로그
         */
        ThreadContext.put("logName", "test1");
        logger.info("Test1에 대한 로그");

        /**
         * Test2에 대한 로그
         */
        ThreadContext.put("logName", "test2");
        logger.info("Test2에 대한 로그");

        // 키 부분 제거
        ThreadContext.remove("logName");
    }
}
