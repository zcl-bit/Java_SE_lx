package com.zcl;

/**
 * 封装：
 * 概念：
 *      将类的某些信息隐藏在类内部，不允许外部程序直接访问，
 *      而是通过该类提供的方法来实现对隐藏信息的操作和访问
 *
 *  封装解决什么问题：
 *      如果任何一个处理类都可以直接对dog进行赋值操作，那么当值不准确的时候，可能会产生额外的结果
 *          如何在赋值的同时，添加一些逻辑判断呢？
 *              封装可以解决此问题
 *  作用：
 *      使用封装可以保证数据的规范，不符合规范的数据将无法进行操作
 *
 *  好处：
 *      1、隐藏类的内部实现细节
 *      2、只能通过提供的方法进行访问，其他方法无法访问
 *      3、可以根据需求添加复杂的逻辑判断语句
 *      4、方便修改实现
 *  面向对象的封装（狭义）可以用一句话进行概述：为了保证数据安全和规范
 *      将类中的属性设置为私有属性，提供公有的外部方法供程序进行调用，可以实现丰富的细节操作
 *
 *  广义的封装：
 *      可以将完成特定功能的代码块封装成一个方法，供不同的程序进行调用
 *
 * */


public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("大黄");
//        dog.setAge(-20);
//        dog.age = -23;
/*         int age = 10;
       if (age > 0){
            dog.age = age;
        }*/
        dog.setAge(20);
        dog.setColor("yellow");
//        dog.show();
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        System.out.println(dog.getColor());
    }
}
