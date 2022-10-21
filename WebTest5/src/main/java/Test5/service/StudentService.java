package Test5.service;

import Test5.dao.StudentDao;
import Test5.javabean.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentService {
    private StudentDao studentDao = new StudentDao();
    /**
     *增加信息
     */
    public int InsertInfo(Student student) {
        try {
            return studentDao.InsertInfo(student);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    /**
     *删除信息
     */
    public int DeleteInfo(Integer stud_id) {
        try {
            return studentDao.DeleteInfo(stud_id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    /**
     *修改信息
     */
    public int UpdateInfo(Student student) {
        try {
            return studentDao.UpdateInfo(student);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    /**
     *查询信息
     */
    public Student SelectInfo(Integer stud_id) {
        try {
            return studentDao.SelectInfo(stud_id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *查询信息
     */
    public List<Student> SelectAllInfo() {
        try {
            return studentDao.SelectAllInfo();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
