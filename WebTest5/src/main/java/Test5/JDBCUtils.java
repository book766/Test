package Test5;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

public class JDBCUtils {
    private static DataSource ds = null;

    static {
        BasicDataSource bds = new BasicDataSource();

        bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        bds.setUrl("jdbc:mysql://192.168.31.200:3330/info?serverTimezone=GMT%2B8");
        bds.setUsername("root");
        bds.setPassword("xm2020011");

        bds.setInitialSize(5);
        ds = bds;
    }

    public static DataSource GetConnection(){
        return ds;
    }
}
