package Test3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet2",urlPatterns="/userinfo")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset = utf-8");

        PrintWriter print = response.getWriter();

        String form_token = request.getParameter("form_token"); //获取表单中的token
        String session_token = (String)request.getSession().getAttribute("session_token"); //获取session中的token

        if(session_token != null && session_token.equals(form_token)){ //对比表单和session的token
            request.getSession().removeAttribute("session_token");
            print.println(" <h1 align=\"center\" style=\"color:red\">欢迎" + request.getParameter("username") +"使用XXX系统<h1/>");
        } else {
            print.println("请不要重复提交！");
        }
    }
}