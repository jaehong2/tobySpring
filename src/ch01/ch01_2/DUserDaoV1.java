package ch01.ch01_2;

import java.sql.Connection;
import java.sql.SQLException;

public class DUserDaoV1 extends UserDaoV4 {
    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        return null;
    }
}
