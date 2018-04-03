package com.yp.AnotationDemo;

import java.lang.annotation.*;

/**
 * Created by yuan on 2018/2/8.
 */
@Target(ElementType.TYPE)//反射用在哪
@Retention(RetentionPolicy.RUNTIME)//如果需要用反射读取值，则必须是runtime
@Documented
public @interface Ano1 {
    String value();
}
