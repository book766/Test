package Test5.Filter;

import Test5.javabean.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//权限过滤器
@WebFilter(filterName = "AdminFilter",urlPatterns = "/student/*")
public class AdminFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;

        User user = (User)request.getSession().getAttribute("user");
        if(user == null){
            response.sendRedirect(request.getContextPath() + "/Test5/login.jsp");
        }else {
            //管理员
            if(user.getUser_role().equals("admin")){
                chain.doFilter(req, resp);
            } else {
                //普通用户
                request.getRequestDispatcher("/student/list").forward(request, response);
            }
        }

    }

    @Override
    public void destroy() {
    }
}
