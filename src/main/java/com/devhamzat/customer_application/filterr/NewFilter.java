package com.devhamzat.customer_application.filterr;

import jakarta.servlet.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class NewFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("New filter is called...");

        filterChain.doFilter(servletRequest,servletResponse);
    }
}
