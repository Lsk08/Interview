package com.yp.littleFunction;

import java.io.File;
import java.io.IOException;
import java.lang.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by yuan on 2018/1/10.
 */
public class FileRead {

    public static String readFileAsString(Path path) throws IOException {
        return new String(Files.readAllBytes(path),"GBK");
    }

    public static String getCurrentWorkingDirectoryPath() {
        return FileSystems.getDefault().getPath("").toAbsolutePath().toString();
    }


    public static void main(String[] args) {
        try {
            String s=readFileAsString(new File("D:/reports.xml").toPath());
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(getCurrentWorkingDirectoryPath());
    }
}
