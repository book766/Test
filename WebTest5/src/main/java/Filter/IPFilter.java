package Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "IPFilter",urlPatterns = "/test")
public class IPFilter implements Filter {
    private int StartIP;
    private int EndIP;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        ServletContext context = filterConfig.getServletContext();
//        StartIP = Integer.parseInt(context.getInitParameter("StartIP").replace(".",""));
//        EndIP  = Integer.parseInt(context.getInitParameter("EndIP").replace(".",""));
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
//        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
//
//        String accessip = httpServletRequest.getRemoteAddr();
//
//        if(httpServletRequest.getServerName().equals("localhost")){
//            accessip = "localhost";
//        }
//
//        httpServletRequest.setAttribute("ip",accessip);
//        int ip = Integer.parseInt(accessip.replace(".",""));
//        if(ip < StartIP || ip > EndIP){
//            httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/Test2/iperroe.jsp");
//        } else {
//            chain.doFilter(request, response);
//        }
    }

    @Override
    public void destroy() {
    }
}
