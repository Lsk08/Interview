package com.yp.littleFunction;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by yuan on 2018/1/10.
 */
public class Exception {

    public static String stackTraceAsString(final Throwable throwable) {
        final StringWriter sw = new StringWriter();
        throwable.printStackTrace(new PrintWriter(sw));
        return sw.toString();
    }

    public static void main(String[] args) {
        String s=null;
        try{
            s.length();
        }catch(java.lang.Exception e){
            String ss=stackTraceAsString(e);
            System.out.println(ss);
        }

    }
}
