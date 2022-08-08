package com.atguigu.java;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author shkstart
 * @create 2022-04-16 17:07
 */
public class FileUtilsTest {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("day27//Rog.png");
        File destFile = new File("day27//Rog3.png");

        FileUtils.copyFile(srcFile, destFile);
    }
}
