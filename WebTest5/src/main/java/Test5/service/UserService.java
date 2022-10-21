package Test5.service;

import Test5.dao.UserDao;
import Test5.javabean.User;

import java.sql.SQLException;

public class UserService {
    private UserDao userDao = new UserDao();
    /**
     *查询信息
     */
    public User SelectInfo(User user) {
        try {
            return userDao.SelectInfo(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
