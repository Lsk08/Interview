package com.tips_new_meta.AnotationDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by yuan on 2018/2/8.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Ano2 {
    String value() default "Ano2";
    String description();
}
