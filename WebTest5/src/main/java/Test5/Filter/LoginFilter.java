package Test5.Filter;

import Test5.javabean.User;
import Test5.service.UserService;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//登陆过滤器
@WebFilter(filterName = "LoginFilter",urlPatterns = "/*")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;

        UserService userService = new UserService();

        if(request.getCookies() != null){
            Cookie[] cookies = request.getCookies();
            //获取自动登录cookie
            for(Cookie cookie : cookies) {
                if (cookie.getName().equals("userinfo") && cookie.getValue()!= "") {
                    String userinfo[] = cookie.getValue().split("-");
                    User user = new User(null,userinfo[0],userinfo[1],null);
                    if(userService.SelectInfo(user) != null){
                        request.getSession().setAttribute("user", userService.SelectInfo(user));
                    }
                }
            }
        }
        chain.doFilter(req, resp);
    }

    @Override
    public void destroy() {
    }
}
