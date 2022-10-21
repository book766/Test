package Test5.servlet.student;

import Test5.javabean.Student;
import Test5.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateServlet",urlPatterns="/student/update")
public class UpdateServlet extends HttpServlet {
    private StudentService studentService = new StudentService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/student/list").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student s = new Student(Integer.parseInt(request.getParameter("stud_id")),
                request.getParameter("stud_name"),
                request.getParameter("stud_gender"),
                request.getParameter("stud_address"),
                request.getParameter("stud_phone"));
        studentService.UpdateInfo(s);
        request.getRequestDispatcher("/student/list").forward(request, response);
    }
}
