package com.ifsage;

/**
 * Created by yuan on 2018/4/16.
 */
//内部类 的 有点
    //内部类可以实现不同的接口  相当于多实现
    //方便代码的逻辑隐藏
    //方便接口实现 和 线程代码 【匿名内部类】

    //综述  内部类 = 匿名 + 成员 + 局部 + 静态
    //匿名 一般用于接口实现
    //一般  自由访问外部类的所有字段和方法 --> 持有外部类的引用 --> 必须依赖于一个外部类的实例
    //静态  只能访问外部类的静态字段和方法 --> 不持有外部类的引用 --> 不依赖于外部类
    // 一般 和 静态 的作用也就是   多继承 和  封装
    //另外  从性能上将  如果内部类不需要外部类的字段和方法 可以考虑静态内部类 以增加性能
public class InnerClassDemo {

    public static void main(String[] args){
        // 初始化Bean1
        InnerClassDemo.Bean1 bean1 = new InnerClassDemo().new Bean1();
        bean1.I++;
        // 初始化Bean2
        InnerClassDemo.Bean2 bean2= new InnerClassDemo.Bean2();
        bean2.J++;
        //初始化Bean3
    Bean.Bean3 bean3=new Bean().new Bean3();
        bean3.k++;
    }
    class Bean1{
        public int I = 0;
    }

    static class Bean2{
        public int J = 0;
    }
}

class Bean{
    class Bean3{
        public int k = 0;
    }
}
