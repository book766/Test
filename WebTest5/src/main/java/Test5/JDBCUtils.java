package Test5;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class JDBCUtils {
    /**
     * 加载驱动
     * 设置url，user，password
     * 获得数据库链接对象
     * 关闭资源
     */
    public static DataSource ds = null;

    static {
        // 获取DBCP数据库连接池实现类对象
        BasicDataSource bds = new BasicDataSource();
        // 设置连接数据库需要的配置信息
        bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        bds.setUrl("jdbc:mysql://192.168.31.200:3330/info?serverTimezone=GMT%2B8");
        bds.setUsername("root");
        bds.setPassword("xm2020011");
        // 设置连接池的初始化连接参数
        bds.setInitialSize(5);
        ds = bds;
    }

    public static DataSource GetConnection(){
        return ds;
    }

    public static void main(String[] args) throws SQLException {
        // 获取数据库连接对象
        Connection conn = ds.getConnection();
        //获取数据库连接信息
        DatabaseMetaData metaData = conn.getMetaData();
        //打印数据库连接信息
        System.out.println(metaData.getURL()
                +",UserName="+metaData.getUserName()
                +","+metaData.getDriverName());
    }
}
