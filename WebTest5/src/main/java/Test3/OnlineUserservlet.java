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

@WebServlet(name = "OnlineUserservlet", urlPatterns = "/login")
public class OnlineUserservlet extends HttpServlet {
    private Logger log = LoggerFactory.getLogger(OnlineUserservlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        if(request.getParameter("username") != null && !request.getParameter("username").equals("")){
            User user = new User(request.getParameter("username"));

            String info = user.getUsername() + "登录系统" + Utils.getcurrenttime();
            log.info(info);
            Utils.record(info);

            request.getSession().setAttribute("user",user);
            request.getRequestDispatcher("/Test3/info.jsp").forward(request, response);
        }
        response.sendRedirect(request.getContextPath() + "/Test3/login.html");
    }
}
