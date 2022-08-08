package com.atguigu.java1;

/**
 * @author shkstart
 * @create 2021-11-24 11:52
 */
public class BankTest {

}

class Bank {
    private Bank(){};

    public static  Bank bank = null;

    public static  Bank getBank() {
//        方法一：
//        synchronized (Bank.class) {
//            if (bank == null){
//                bank = new Bank();
//            }
//            return bank;
//        }
        //方法二：
        if(bank==null ){
            synchronized (Bank.class){
                bank = new Bank();
            }



        }
        return bank;
    }

}
