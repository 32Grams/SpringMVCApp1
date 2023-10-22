package ru.semenov.springcourse.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class MySpringMVCDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //Указываем ссылку на наш класс с конфигурацией
        return new Class[] {SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        //Маппим все запросы которые начинаются с "/"
        return new String[] {"/"};
    }
}
