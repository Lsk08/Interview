package com.sourcecode;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by yuan on 2018/7/9.
 */
//BigDecimal 底层把小数转化成整数 或者 bigInteger 并且记录 scale小数位数  计算结果
    //是否用 int 或者 bigInteger 判断 2个数是否溢出 Long.MAX_VALUE 如果溢出就转化成bigInteger 以Int[]的形式用位运算得到结果
public class BigDecimalDemo {

    public static void main(String[] args) {
        BigDecimal big1=new BigDecimal("0.32321321321321321321321321321321321321321321321321321321");
        BigDecimal big2=new BigDecimal("0.232132133333333333333333333333333333333333333333333333333333333333333333333333333333");

        System.out.println(big1.add(big2));

        BigInteger big3=new BigInteger("1");
    }
}
