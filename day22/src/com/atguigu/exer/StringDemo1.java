package com.atguigu.exer;

import org.junit.jupiter.api.Test;

/**
 * @author shkstart
 * @create 2021-12-09 14:24
 */
public class StringDemo1 {
    public int getcount(String mainString, String subString) {
        int mainLength = mainString.length();
        int subLength = subString.length();
        int count = 0;
        int index = 0;
        if (mainLength >= subLength) {
            //方法一
//            while ((index = mainString.indexOf(subString)) != -1) {
//
//                count++;
//                mainString = mainString.substring(index + subString.length());
//            }

            //方法二
            while ((index = mainString.indexOf(subString, index)) != -1) {
                count++;
                index += subLength;
            }
        }
        return count;
    }

    @Test
    public void test() {
        StringDemo1 s1 = new StringDemo1();
        int count = s1.getcount("abcdfgabdhgdhabhdghgdhabihjh", "ab");
        System.out.println(count);
    }

}
