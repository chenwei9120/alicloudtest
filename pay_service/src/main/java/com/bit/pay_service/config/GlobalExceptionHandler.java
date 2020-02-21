package com.bit.pay_service.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName CustomAdvice.java
 * @Description TODO
 * @createTime 2020年02月21日 09:01:00
 */
@ControllerAdvice(basePackages = {"com.bit.order_service"})
public class GlobalExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public Object handleGlobalException(RuntimeException e) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            e.printStackTrace(new java.io.PrintWriter(outputStream, true));
            log.error("异常信息:{}" + System.lineSeparator() + "{}", e.getMessage(), outputStream.toString());
            return "全局异常处理：" + e.getMessage();
        } finally {
            try {
                outputStream.close();
            } catch(IOException ex){ }
        }
    }
}