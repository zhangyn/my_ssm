package com.zzz.demo.ssm_web.core;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class DefaultExceptionHandler   implements HandlerExceptionResolver {

    @ResponseBody
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
                                         Exception ex) {
        //logger.debug("----------unhandle exception-----------");
        PrintWriter writer;
        try {
            writer = response.getWriter();
            String s = "{\"Code\":500,\"msg\":\"unhandler exception\"}";
            writer.write(s);
            writer.flush();
        } catch (IOException e) {
            //logger.error("unhandle exception:", e);
        }
        return null;
    }
}
