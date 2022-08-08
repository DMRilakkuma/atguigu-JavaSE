package com.atguigu.exer;

import org.junit.Test;


/**
 * @author shkstart
 * @create 2021-12-08 17:09
 */
public class StringDemo {
    //方法一
    public String transform(String str, int startIndex, int endIndex) {
        if (str == null || str.length() == 0) {
            return null;
        } else {
            char[] arr = str.toCharArray();
            for (int i = startIndex, j = endIndex; i < j; i++, j--) {
                char replacement = arr[i];
                arr[i] = arr[j];
                arr[j] = replacement;

            }
            return new String(arr);
        }
    }

    //方法二
    public String transform2(String str, int startIndex, int endIndex) {
        if (str != null) {

            String reserveStr = str.substring(0, startIndex);
            for (int i = endIndex; i >= startIndex; i--) {
                reserveStr += str.charAt(i);
            }
            return reserveStr;
        }

        return null;

    }

    //方法三
    public String transform3(String str, int startIndex, int endIndex) {
        StringBuilder builder = new StringBuilder(str.length());

        builder.append(str.substring(0, startIndex));
        for (int i = endIndex; i >= startIndex; i--) {
            builder.append(str.charAt(i));
        }
        builder.append(str.substring(endIndex+1));

        return new String(builder);
    }


    @Test
    public void test() {
        StringDemo demo = new StringDemo();
        String s1 = demo.transform3("abcdefg", 3, 6);
        System.out.println(s1.toString());

    }
}


