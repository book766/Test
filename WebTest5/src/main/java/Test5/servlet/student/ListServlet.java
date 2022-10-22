package Test5.servlet.student;

import Test5.javabean.Student;
import Test5.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//查询所有信息
@WebServlet(name = "ListServlet",urlPatterns="/student/list")
public class ListServlet extends HttpServlet {
    private StudentService studentService = new StudentService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset = utf-8");

        List<Student> list = studentService.SelectAllInfo();
        request.setAttribute("list",list);

        request.getRequestDispatcher("/Test5/student/list.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
