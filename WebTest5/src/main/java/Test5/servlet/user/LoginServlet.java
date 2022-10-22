package Test5.servlet.user;

import Test5.javabean.User;
import Test5.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//用户登录
@WebServlet(name = "UserLoginServlet",urlPatterns="/user/login")
public class LoginServlet extends HttpServlet {
    private UserService userService = new UserService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User(null,request.getParameter("user_name"),
                request.getParameter("user_password"),null);
        User login = userService.SelectInfo(user);
        if(login != null && user.getUser_password().equals(login.getUser_password())){
            //设置session
            request.getSession().setAttribute("user", login);
            if(request.getParameter("remember") != null){
                //设置cookie
                Cookie cookie = new Cookie("userinfo",login.getUser_name() + "-" + login.getUser_password());
                cookie.setPath("/");
                cookie.setMaxAge(60 * 60);
                response.addCookie(cookie);
            }
            //跳转主页
            request.getRequestDispatcher("/user/info").forward(request, response);
        } else {
            response.sendRedirect(request.getContextPath() + "/Test5/login.jsp");
        }
    }
}
