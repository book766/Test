package Test5.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//编码过滤器
@WebFilter(filterName = "EncodeFilter",urlPatterns = "/*")
public class EncodeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }


    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        chain.doFilter(req, resp);
    }

    @Override
    public void destroy() {
    }
}
