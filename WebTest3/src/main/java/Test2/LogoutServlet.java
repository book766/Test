package Test2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LogoutServlet",urlPatterns="/logout")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset = utf-8");

        PrintWriter print = response.getWriter();

        Cookie delete = new Cookie("autologin",null);
        delete.setMaxAge(0);
        delete.setPath("/");

        response.addCookie(delete);

        print.println("已退出");
        response.setHeader("Refresh", "2;URL="+ request.getContextPath() + "/Test2/login.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
