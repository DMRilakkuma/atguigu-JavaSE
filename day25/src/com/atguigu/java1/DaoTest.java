package com.atguigu.java1;

import org.junit.Test;

/**
 * @author shkstart
 * @create 2022-03-29 15:31
 */
public class DaoTest {
    @Test
    public void test(){
        CustomerDao dao = new CustomerDao();
        dao.add(new Customer("sdjdh",1239));

    }
}
