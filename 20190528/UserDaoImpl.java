package dao;

import com.shop.dataSource.DruidDataSource;
import com.shop.pojo.User;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao{
    private QueryRunner qr;

    public UserDaoImpl(){
        qr = new QueryRunner();
    }

    private DruidDataSource dds = DruidDataSource.getDataSource();

    //添加用户
    @Override
    public void addUser(User user) {
        Connection conn = dds.getConnection();
        String sql = "INSERT INTO user(username,password,registerDate) VALUES(?,?,?)";
        try {
            qr.update(conn,sql,user.getUsername(),user.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                DbUtils.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
