package com.atguigu.java;

import org.junit.jupiter.api.Test;

/**
 * @author shkstart
 * @create 2021-12-03 16:26
 */
public class StringMethodTest {
    /*
     String replace(char oldChar, char newChar)：返回一个新的字符串，它是
    通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。
     String replace(CharSequence target, CharSequence replacement)：使
    用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
    */

    @Test
    public void test3(){
        String s1 = "北京尚硅谷教育北京";
        String s2 = s1.replace("北", "南");
        System.out.println(s1);
        System.out.println(s2);

        String s3 = s1.replace("北京", "南京");
        System.out.println(s3);

    }


    /*
    boolean endsWith(String suffix)：测试此字符串是否以指定的后缀结束
     boolean startsWith(String prefix)：测试此字符串是否以指定的前缀开始
     boolean startsWith(String prefix, int toffset)：测试此字符串从指定索引开始的
    子字符串是否以指定前缀开始
    boolean contains(CharSequence s)：当且仅当此字符串包含指定的 char 值序列
   时，返回 true
     int indexOf(String str)：返回指定子字符串在此字符串中第一次出现处的索引
     int indexOf(String str, int fromIndex)：返回指定子字符串在此字符串中第一次出
    现处的索引，从指定的索引开始
     int lastIndexOf(String str)：返回指定子字符串在此字符串中最右边出现处的索引
     int lastIndexOf(String str, int fromIndex)：返回指定子字符串在此字符串中最后
    一次出现处的索引，从指定的索引开始反向搜索
    注：indexOf和lastIndexOf方法如果未找到都是返回-1
     */

    @Test
    public void test2(){
        String s1 = "helloworld";
        boolean b1 = s1.endsWith("ld");
        System.out.println(b1);
        boolean b2 = s1.startsWith("he");
        System.out.println(b2);
        boolean b3 = s1.startsWith("or", 6);
        System.out.println(b3);

        boolean b4 = s1.contains("hel");
        System.out.println(b4);

        int b5 = s1.indexOf("or");
        System.out.println(b5);

        int b6 = s1.indexOf("or", 7);
        System.out.println(b6);

        int b7 = s1.lastIndexOf("or");
        System.out.println(b7);

        int b8 = s1.lastIndexOf("or", 8);
        System.out.println(b8);
    }




    @Test
    public void test() {
        String s1 = "hello";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(4));

        String s2 = "";
        System.out.println(s2.isEmpty());

        String s3 = "HELLO";
        String s5 = s3.toLowerCase();
        System.out.println(s5);

        String s6 = "hello";
        String s7 = "     he  ll  o     ";
        String s8 = s7.trim();
        System.out.println("--------" + s7 + "------------");
        System.out.println("--------" + s8 + "------------");

        String s9 = s1.concat("def");
        System.out.println(s9);
        System.out.println(s1.compareTo(s9));


        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s6.substring(2,5));

    }
}
