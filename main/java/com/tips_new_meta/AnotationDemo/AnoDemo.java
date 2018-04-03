package com.tips_new_meta.AnotationDemo;

import java.lang.annotation.Annotation;

/**
 * Created by yuan on 2018/2/8.
 */
@Ano1("AnoDemo")
public class AnoDemo {

    @Ano2(value="f1",description ="my f1!!!!")
    public static void f1(){
        System.out.println("f1");
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Object c=Class.forName("com.tips_new_meta.AnotationDemo.AnoDemo").newInstance();
        Annotation[] anos=c.getClass().getAnnotations();
        for(Annotation ano:anos){
            if(ano.annotationType()==Ano1.class){
                Ano1 ano1=(Ano1) ano;
                System.out.println(ano1.value());
            }
        }
//        f1();
    }
}
