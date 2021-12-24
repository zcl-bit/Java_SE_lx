package com.zcl.codehomework;
/**
 * @author zcl
 *
 * */
public class Dog {
    /**
     *将属性设置成私有访问权限
     */
    private String strain;
    private int age;
    private String feel;
    private String name;

    public Dog(){

    }
    public Dog(String name,String strain){
        this.name = name;
        this.strain = strain;
    }
    public void roar(){
        if ("心情好".equals(feel)){
            System.out.println("心情好的叫声");
        }else {
            System.out.println("心情不好的叫声");
        }

    }
    public void run(){
        if ("心情好".equals(feel)){
            System.out.println("心情好的跑");
        }else {
            System.out.println("心情不好的跑");
        }
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFeel() {
        return feel;
    }

    public void setFeel(String feel) {
        if ("心情好".equals(feel)||"心情不好".equals(feel)){

            this.feel = feel;
        }else {
            System.out.println("心情输入错误");
            this.feel = "心情好";
            System.out.println("这只狗今天心情很好");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
