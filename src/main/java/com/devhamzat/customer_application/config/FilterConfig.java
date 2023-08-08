package com.devhamzat.customer_application.config;

import com.devhamzat.customer_application.filterr.NewFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<NewFilter> registrationBean(){
       FilterRegistrationBean<NewFilter> registrationBean = new FilterRegistrationBean<>();
       registrationBean.setFilter(new NewFilter());
       registrationBean.addUrlPatterns("/customers/*");

       return registrationBean;
    }
}
