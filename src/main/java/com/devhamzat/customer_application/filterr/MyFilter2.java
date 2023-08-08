package com.devhamzat.customer_application.filterr;

import jakarta.servlet.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(1)
public class MyFilter2 implements Filter {

    @Override

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter 2 is called....");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
