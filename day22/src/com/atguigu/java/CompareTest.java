package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author shkstart
 * @create 2022-01-06 14:58
 */
public class CompareTest {
    @Test
    public void test(){
        String [] arr = new String[]{"AA","DD","CC","FF","EE","BB"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    @Test
    public void test2(){
        Goods[] arr = new Goods[5];
        arr[0] = new Goods("lengxiangMouse",34);
        arr[1] = new Goods("dellMouse",43);
        arr[2] = new Goods("xiaomiMouse",12);
        arr[3] = new Goods("huaweiMouse",65);
        arr[4] = new Goods("microsoftMouse",65);


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void test3() {
        String[] arr = new String[]{"CC", "AA", "EE", "DD", "BB", "FF"};
        Arrays.sort(arr, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("输入类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));

    }
}
