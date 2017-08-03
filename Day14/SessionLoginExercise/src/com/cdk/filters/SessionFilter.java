package com.cdk.filters;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SessionFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpSession session = ((HttpServletRequest)servletRequest).getSession();
        if((Boolean) session.getAttribute("Login_Status") == false){
            servletResponse.getWriter().write("<h1 style='color:Black'>Redirecting to login page</h1>");
            RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("/index.html");
            requestDispatcher.forward(servletRequest,servletResponse);
        }else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
