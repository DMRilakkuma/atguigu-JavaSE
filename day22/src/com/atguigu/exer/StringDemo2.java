package com.atguigu.exer;

import org.junit.jupiter.api.Test;

/**
 * @author shkstart
 * @create 2021-12-09 15:53
 */
public class StringDemo2 {
    public String  getMaxSameString(String str1, String str2) {
        if (str1 != null && str2 != null) {
            String maxString = (str1.length() >= str2.length()) ? str1 : str2;
            String minString = (str1.length() < str2.length()) ? str1 : str2;
            String subString = null;
            for(int i = 0;i < minString.length() ; i++){
                for(int x = 0,y = minString.length() - i ; y<minString.length() ;x++, y++){
                    subString = minString.substring(x,y);
                    if(maxString.contains(subString)){
                        return subString;
                    }

                }
            }

        }
        return null;
    }

    @Test
    public void test(){
        StringDemo2 s1 = new StringDemo2();
        String string = s1.getMaxSameString("ahhedbfhbhellolo", "sdhjfgjgfhellolojvchnbejh");
        System.out.println(string);


    }
}
