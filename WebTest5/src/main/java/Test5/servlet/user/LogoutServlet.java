package Test5.servlet.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//用户登出
@WebServlet(name = "UserLogoutServlet",urlPatterns="/user/logout")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //移除session
        request.getSession().removeAttribute("user");

        //移除cookie
        Cookie delete = new Cookie("userinfo",null);
        delete.setPath("/");
        delete.setMaxAge(-1);
        response.addCookie(delete);

        //跳转登录
        response.sendRedirect(request.getContextPath() + "/Test5/login.jsp");
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}