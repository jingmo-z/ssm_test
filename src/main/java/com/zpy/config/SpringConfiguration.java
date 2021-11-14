package com.zpy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zpy
 */
@Component
@Import(JdbcConfig.class)
@ComponentScan(value = "com.zpy"
        , excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class))
@EnableTransactionManagement
public class SpringConfiguration {
}
