package Test5.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "AdminFilter",urlPatterns = "/student/*")
public class AdminFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse requestp = (HttpServletResponse)resp;

        System.out.println("filter");
//        User user = (User) request.getSession().getAttribute("user");
//        if(!user.getUser_role().equals("admin")) {
//            requestp.sendRedirect("../index.jsp");
//        }else {
//            chain.doFilter(req, resp);
//        }
    }

    @Override
    public void destroy() {

    }
}
