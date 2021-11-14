package com.zpy.controller.advice;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @author zpy
 */
@ControllerAdvice   //用于增强所有的controller方法
public class InitBinderAdvice {

    //初始化数据绑定器
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));
    }

    @ModelAttribute     //所有控制器方法之前之前都会执行该方法
    public void shouModel() {
        System.out.println("showModel running..............");
    }
}
