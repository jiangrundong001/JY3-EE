package com.neuedu.dataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

/**
 * 配置连接池
 */
public class DruidDataSource {

    private static Properties prop = new Properties();

    private static DruidDataSource ds = null;

    private DruidDataSource() {


    }

    public static DruidDataSource getDataSource() {
        if (null == ds) {
            ds = new DruidDataSource();
        }
        return ds;
    }

    public Connection getConnecyion() {
        try {
            prop.load(DruidDataSource.class.getResourceAsStream("/mysql.properties"));
            try {
                DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
                Connection connection = dataSource.getConnection();
                return connection;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        DruidDataSource dataSource = DruidDataSource.getDataSource();
        Connection connection = dataSource.getConnecyion();
        System.out.println(connection);
    }

}