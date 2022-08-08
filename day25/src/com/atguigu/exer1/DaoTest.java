package com.atguigu.exer1;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-03-30 15:03
 */
public class DaoTest {
    public static void main(String[] args) {
        Dao<User> dao = new Dao<>();
        dao.save("1",new User(2001,1,"WB"));
        dao.save("2",new User(2002,2,"DB"));
        dao.save("3",new User(203,3,"NB"));
        dao.save("4",new User(2004,4,"MB"));

        User user1 = dao.get("2");
        System.out.println(user1.toString());

        dao.update("2",new User(2001,1,"WB"));
        System.out.println(dao.toString());

        List<User> list = dao.list();
        System.out.println(list);

        dao.delete("2");
        System.out.println(dao.toString());

    }
}
