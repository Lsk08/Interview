package com.javabase.dynamiacProx;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by yuan on 2018/4/20.
 */
//Java使用 Proxy.newProxyInstance创建动态代理对象  要求 实现某一个接口
    //另 cglib的动态代理 无需实现接口
public class LiuProxy {

    //传入参数 p 也就是被代理的对象
    public Person getProxy(Person p){
        return (Person) Proxy.newProxyInstance(this.getClass().getClassLoader(), p.getClass().getInterfaces(),
                new InvocationHandler() {
            //通过这个handler执行对应的动作
            //proxy 表示代理自己  也就是所有的动作通过这个proxy完成  method相当于对应的方法 args表示参数
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(method.getName().equals("sing")){
                    System.out.println("proxy sing");
                    //当然也可以访问真实对象的方法
                    //return method.invoke(p,args);
                    return null;
                }

                if(method.getName().equals("dance")){
                    System.out.println("proxy dance");

                    return method.invoke(p,args);
                }


                return null;
            }
        }
        );
    }

    public static void main(String[] args) {
        LiuProxy LiuProxy=new LiuProxy();
        //Proxy执行的所有动作都是由 invocationHandler.invoke(Object proxy,Method method,Object[] args) 执行
        //其中可以通过method 得知 调用的方法  args 得知参数 从而做出一些操作  例如 拦截等等
        //动态应该是说被代理的对象只要求实现具体接口就行 而 对于具体代理什么对象 在运行时确定 (多态？)
        LiuProxy.getProxy(new Liu()).sing();
    }
}
