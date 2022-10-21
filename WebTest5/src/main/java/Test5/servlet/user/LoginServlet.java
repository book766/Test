package Test5.servlet.user;

import Test5.javabean.User;
import Test5.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns="/user/login")
public class LoginServlet extends HttpServlet {
    private UserService userService = new UserService();
    //测试 '赵瑾瑜', '31420031' '钟思聪', '522484389'
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User(null,request.getParameter("user_name"),
                request.getParameter("user_password"),null);
        System.out.println(userService.SelectInfo(user));
    }
}
