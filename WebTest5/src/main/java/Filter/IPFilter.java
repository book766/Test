package Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "IPFilter",urlPatterns = "/test")
public class IPFilter implements Filter {
    private String StartIP;
    private String EndIP;
    private String LocalIP;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        ServletContext context = filterConfig.getServletContext();
        StartIP = (String)context.getInitParameter("StartIP");
        EndIP  = (String)context.getInitParameter("EndIP");
        LocalIP = (String)context.getInitParameter("LocalIP");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        String VisitIP = request.getRemoteAddr();
        if(VisitIP.equals(LocalIP)){
            chain.doFilter(request, response);
        }

        String[] VisitIPDetail = VisitIP.split(".");
        String[] StartIPDetail = StartIP.split(".");
        String[] EndIPDetail = EndIP.split(".");

//        if(!VisitIPDetail[0].equals(StartIPDetail[0]) && !VisitIPDetail[0].equals(EndIPDetail[0])){
//            return ;
//        }
//
//        if(!VisitIPDetail[1].equals(StartIPDetail[1]) && !VisitIPDetail[1].equals(EndIPDetail[1])){
//            return ;
//        }
//
//        if(VisitIPDetail[2] < ){
//            return ;
//        }

        // 放行
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
