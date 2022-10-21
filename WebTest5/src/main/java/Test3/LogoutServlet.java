package Test3;

import Test4.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LogoutServlet", urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {
    private Logger log = LoggerFactory.getLogger(LogoutServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        User user = (User)request.getSession().getAttribute("user");

        String info = user.getUsername() + "退出系统" + Utils.getcurrenttime();
        log.info(info);
        Utils.record(info);

        request.getSession().invalidate();

        response.sendRedirect(request.getContextPath() + "/Test3/login.html");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
