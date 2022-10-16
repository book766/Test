package Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "VisitFilter",urlPatterns = "/images")
public class VisitFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        String referer = request.getHeader("referer");
        System.out.println(referer);
//        refererr.contains(request.getServerName());

        // 放行
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}