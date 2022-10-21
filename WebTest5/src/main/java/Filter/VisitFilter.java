package Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "VisitFilter",urlPatterns = "/images")
public class VisitFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
//        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
//
//        String accesspath = httpServletRequest.getHeader("referer");
//
//        if(accesspath != null && accesspath.startsWith("http://localhost")){
//            chain.doFilter(request, response);
//        } else {
//            httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/Test1/accesserroe.jsp");
//        }
    }

    @Override
    public void destroy() {
    }
}