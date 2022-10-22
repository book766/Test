package Test5.dao;

import Test5.JDBCUtils;
import Test5.javabean.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDao{
    /**
     *查询信息
     */
    public User SelectInfo(User user)throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtils.GetConnection());
        String sql = "select user_id,user_name,user_password,user_role from user where user_name = ?";
        return runner.query(sql,new BeanHandler<>(User.class),user.getUser_name());
    }
}