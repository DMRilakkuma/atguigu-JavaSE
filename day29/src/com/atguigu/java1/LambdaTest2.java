package com.atguigu.java1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author MC
 * @create 2022-05-09 14:34
 * @Description:
 */
public class LambdaTest2 {
    @Test
    public void test1(){
        happyTime(1000, new Consumer<Double>() {
            @Override
            public void accept(Double b) {
                System.out.println("学习太累了，让人去买瓶矿泉水，价格为："+ b);
            }
        });

        System.out.println("*******************");
        happyTime(1000, money -> System.out.println("矿泉水价格为："+ money));

    }

    public void happyTime(double money, Consumer<Double> con){
        con.accept(money);
    }

    @Test
    public void test2(){
        List<String> list = Arrays.asList("北京","南京","天津","东京","西京","普京");
        List<String> filterlist = filterString(list, new Predicate<String>() {

            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });
        System.out.println(filterlist);

        List<String> filterlist2 = filterString(list , s -> s.contains("京"));
        System.out.println(filterlist2);

    }

    public List<String> filterString(List<String> list , Predicate<String> pre){
        ArrayList<String> result = new ArrayList<String>();
        for (String s : list) {
            if(pre.test(s)){
                result.add(s);
            }
        }

        return result;
    }
}
