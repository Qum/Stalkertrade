package qum.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = "*.do")
public class AuthFilter implements Filter {

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
	    FilterChain chain) throws IOException, ServletException {
	HttpServletRequest request = (HttpServletRequest) servletRequest;
	if (request.getSession().getAttribute("LoggetUser") != null) {
	    chain.doFilter(servletRequest, servletResponse);
	} else {
	    HttpServletResponse resp = (HttpServletResponse) servletResponse;
	   resp.sendRedirect("index.jsp");
	}
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }

}
