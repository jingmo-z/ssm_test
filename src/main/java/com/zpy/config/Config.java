package com.zpy.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.EnumSet;

/**
 * @author zpy
 */
public class Config extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 注册字符集过滤器
     *
     * @param servletContext
     * @throws ServletException
     */
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("utf-8");
        //添加到容器
        FilterRegistration.Dynamic registration = servletContext.addFilter("characterEncodingFilter", characterEncodingFilter);
        //添加映射
        registration.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST,
                DispatcherType.FORWARD, DispatcherType.INCLUDE), false, "/*");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
