package com.ifsage.generic;

/**
 * Created by yuan on 2018/4/16.
 */
public class Plant<T> {

    private T item;

    T get(){
        return item;
    }

    void put(T t){
        item=t;
    }

    public static void main(String[] args) {
        Plant<Fruit> fruits2=new Plant<Fruit>();
        fruits2.put(new Apple());
        fruits2.put(new Fruit());

        // ? extends Fruit 是上界通配符  也就是 所有Fruit和所有Fruit的子类 都可以
        //也就是Fruit 是泛型的上界
        //也就是泛型的继承  说明实际的泛型是引用的子类
        Plant<? extends Fruit> fruits=new Plant<Apple>();
        Fruit fruit = fruits.get();//也就是 extends 只能用于get 并且使用Fruit 也就是上界接受 因为不知道是哪个子类
        fruits.put(null);//put 除了是null都不行   因为不知道具体是哪个子类


        Plant<? super Fruit> foods=new Plant<Fruit>();
        foods.put(new Fruit());
        foods.put(new Apple());
//        foods.put(new Food());

        Object object = foods.get();

    }
}
