package com.ifsage;

/**
 * Created by yuan on 2018/4/16.
 */

/**
 *  1 默认方法  抽象类可以有默认方法  接口不可以
 *  2 抽象类使用 extends 实现 且 如果子类时非抽象类必须实现全部方法  接口使用implements 实现 必须实现全部方法
 *  3 构造器  抽象类 可以有构造器  而  接口不行
 *  4 与正常类的区别  抽象类除了不能实例化 没有任何区别   接口 完全不同
 *  5 访问修饰符  抽象类 可以有 public protected default 等等  接口默认是public 并且无法更改
 *  6 main 方法  抽象类 可以有它的 main 方法 并且可以运行   接口没有main方法
 *  7 多继承   抽象类 不能多继承  接口可以
 *  8 速度  抽象类速度较快  而  接口较慢  = 接口需要寻找实现类
 *  9 添加新方法  抽象类可以添加新方法的默认实现  而  接口不能 添加新方法后必须为每一个子类添加对应的方法
 */

/**
 * 应用场景
 * 1 如果想多继承 只能用接口
 * 2 如果基本方法在不断改变 就是用 抽象类
 * 3 如果想有一些默认的实现 就使用抽象类
 */
public abstract class AbstractClassAndInterface {

    private String name;
    private Integer age;

    public AbstractClassAndInterface(String name,Integer age){
        this.name=name;
        this.age=age;
    }

    public abstract void f1();

    protected abstract void f2();

    abstract void f3();

//    private abstract void f4();

    public static void main(String[] args) {
        System.out.println("abstract class main");
    }
}
