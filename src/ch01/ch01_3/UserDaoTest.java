package ch01.ch01_3;

import ch01.ch01_2.User;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {

        UserDaoV6 dao = new UserDaoV6(new DConnectionMaker());
        User user = new User();
        user.setId("whiteship5");
        user.setName("백기선");
        user.setPassword("married");

        dao.add(user);
        System.out.println(user.getId() + " success");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
        System.out.println(user2.getName() + " success");
    }
}
