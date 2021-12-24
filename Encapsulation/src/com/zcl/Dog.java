package com.zcl;

/**
 * 定义类的时候需要包含以下组件:
 *      私有属性
 *      构造方法
 *      set/get方法
 *      普通方法
 *
 * */


public class Dog {
    //将属性进行私有化
    private int age;
    private String name;
    private String color;

    public Dog() {

    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("输入年龄不规范，请重新输入");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        if (age > 0) {

            this.age = age;
        } else {
            System.out.println("年龄不规范");
        }

        this.color = color;

    }

    public void eat() {
        System.out.println("eating 骨头");
    }

    public void play() {
        System.out.println("playing……");
    }

    public void show() {
        System.out.println("name:" + this.name);
        System.out.println("age:" + this.age);
        System.out.println("color:" + this.color);
    }
}
