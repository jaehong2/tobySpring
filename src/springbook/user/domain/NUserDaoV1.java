package springbook.user.domain;

import java.sql.Connection;
import java.sql.SQLException;

public class NUserDaoV1 extends UserDaoV4{

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        return null;
    }
}