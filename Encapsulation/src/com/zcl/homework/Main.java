package com.zcl.homework;
/**
 * @author zcl
 * @date 2021/12/24
 *
 * */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("大黄");
        dog.setHealth(-98);
        dog.setLove(0);
        dog.setStrain("拉布拉多");
        System.out.println(dog.getName());
        System.out.println(dog.getHealth());
        System.out.println(dog.getLove());
        System.out.println(dog.getStrain());

        Dog dog1 = new Dog("大黄1","牧羊犬");
        System.out.println(dog1.getName());
        System.out.println(dog1.getStrain());

        Penguin penguin = new Penguin();
        penguin.setSex("SEX_MALE1");
        System.out.println(penguin.getSex());



    }
}
