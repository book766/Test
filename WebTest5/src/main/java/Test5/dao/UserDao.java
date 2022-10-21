package Test5.dao;

import Test5.JDBCUtils;
import Test5.javabean.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDao{
    /**
     *增加信息
     */
    public int InsertInfo(User user) throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtils.GetConnection());
        String sql = "insert into user(user_name,user_password,user_role) values (?,?,?)";
        return runner.update(sql,user.getUser_name(),user.getUser_password(),"普通用户");
    }

    /**
     *修改信息
     */
    public void UpdateInfo()throws SQLException {
//        QueryRunner runner = new QueryRunner(JDBCUtils.GetConnection());
//
//        String sql = "update user set stud_name = ? where stud_id =  ?";
//
//        return runner.update(sql,"test",100);
    }

    /**
     *查询信息
     */
    public User SelectInfo(User user)throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtils.GetConnection());
        String sql = "select user_name,user_password,user_role from user where user_name = ?";
        return runner.query(sql,new BeanHandler<>(User.class),user.getUser_name());
    }
}