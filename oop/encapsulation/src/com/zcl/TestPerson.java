package com.zcl;
/**
 * @author zcl
 *
 *
 *
 * */
public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "张三";
        p1.show();

        Person p2 = new Person();
        p2.age = 35;
        p2.name = "李四";
        p2.show();
    }
}
