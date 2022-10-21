package Test5.dao;

import Test5.JDBCUtils;
import Test5.javabean.Student;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class StudentDao {
    /**
     *增加信息
     */
    public int InsertInfo(Student student) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtils.GetConnection());
        String sql = "insert into student(stud_name,stud_gender,stud_address,stud_phone) values (?,?,?,?)";
        return runner.update(sql,
                student.getStud_name(),
                student.getStud_gender(),
                student.getStud_address(),
                student.getStud_phone());
    }

    /**
     *删除信息
     */
    public int DeleteInfo(Integer stud_id)throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtils.GetConnection());
        String sql = "delete from student where stud_id = ?";
        return runner.update(sql,stud_id);
    }

    /**
     *修改信息
     */
    public int UpdateInfo(Student student)throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtils.GetConnection());
        String sql = "update student set stud_name = ?," +
                "stud_gender = ?," +
                "stud_address = ?," +
                "stud_phone = ? " +
                "where stud_id =  ?";
        return runner.update(sql,
                student.getStud_name(),
                student.getStud_gender(),
                student.getStud_address(),
                student.getStud_phone(),
                student.getStud_id());
    }

    /**
     *查询单个信息
     */
    public Student SelectInfo(Integer stud_id)throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtils.GetConnection());
        String sql = "select * from student where stud_id = ?";
        Student s = runner.query(sql,new BeanHandler<>(Student.class),stud_id);
        return s;
    }

    /**
     *查询所有信息
     */
    public List<Student> SelectAllInfo()throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtils.GetConnection());
        String sql = "select * from student";
        List<Student> list = runner.query(sql,new BeanListHandler<>(Student.class));
        return list;
    }
}
