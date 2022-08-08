package com.atguigu.java;

import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;
import org.testng.annotations.Test;

/**
 * @author shkstart
 * @create 2021-12-07 18:53
 */
public class StringBufferBuilderTest {


    @Test
//    StringBuffer append(xxx)：提供了很多的append()方法，用于进行字符串拼接
//    StringBuffer delete(int start,int end)：删除指定位置的内容
//    StringBuffer replace(int start, int end, String str)：把[start,end)位置替换为str
//    StringBuffer insert(int offset, xxx)：在指定位置插入xxx
//    StringBuffer reverse() ：把当前字符序列逆转
//    public int indexOf(String str)
//    public String substring(int start,int end)
//    public int length()
//    public char charAt(int n )
//    public void setCharAt(int n ,char ch)



    public void test2(){
        StringBuffer s1 = new StringBuffer("abc");
        s1.append(1);
        s1.append('1');
        s1.delete(2,3);
        s1.replace(1,3,"hello");
        s1.insert(2,"王兵");
//        s1.reverse();
        int a = s1.indexOf("o");
        String substring = s1.substring(2, 5);
        System.out.println(substring);
        System.out.println(s1);
        System.out.println(a);
        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        s1.setCharAt(2,'猪');
        System.out.println(s1);
    }
    @Test
    public void test(){
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0,'m');
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer(16);

        System.out.println(sb2.length());

    }
}
