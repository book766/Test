package Test2;

import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet",urlPatterns="/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset = utf-8");

        Cookie[] list = request.getCookies();

        for(Cookie cookie : list) { //获取自动登录cookie
            if (cookie.getName().equals("autologin")) {
                request.setAttribute("user", cookie.getValue());
                request.getRequestDispatcher("/Test2/welcome.jsp").forward(request, response); //自动登录
            }
        }
        response.sendRedirect(request.getContextPath() + "/Test2/login.jsp"); //无自动登录返回登录页
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset = utf-8");

        PrintWriter print = response.getWriter();

        if (request.getParameter("username").equals("")) {  //判断用户名是否为空
            print.println("请输入用户名登录");
            response.setHeader("Refresh", "2;URL=" + request.getContextPath() + "/Test2/login.jsp");
        } else if (!request.getParameter("username").equals("张三")) {  //判断用户名是否正确
            print.println("用户名错误");
            response.setHeader("Refresh", "2;URL=" + request.getContextPath() + "/Test2/login.jsp");
        } else if (request.getParameter("username").equals("张三")) {
            User user = new User(request.getParameter("username"));
            String login = request.getParameter("login");
            if (login != null) { //自动登录选项(设置cookie)
                Cookie autologin = new Cookie("autologin", user.getName());

                autologin.setMaxAge(60 * 10);
                autologin.setPath("/");

                response.addCookie(autologin);
                request.setAttribute("user", autologin.getValue());
                request.getRequestDispatcher("/Test2/welcome.jsp").forward(request, response);
            }

            request.setAttribute("user", user.getName());
            request.getRequestDispatcher("/Test2/welcome.jsp").forward(request, response);
        }
    }
}
