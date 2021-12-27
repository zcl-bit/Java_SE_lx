package com.zcl.homework;

public class Penguin {
    String name;
    int health;
    int love;
    String sex;
    public static String SEX_MALE;
    public static String SEX_FEMALE;

    public Penguin(){

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth(){
        return health;
    }
    public void setLove(int love){
        this.love = love;
    }
    public int getLove(){
        return love;
    }
    public void setSex(String sex){
        if ("SEX_MALE".equals(sex)||"SEX_FEMALE".equals(sex)){

            this.sex = sex;
        }else {
            System.out.println("您输入的性别有错误，请重新输入");
        }
    }
    public String getSex(){
        return sex;
    }


}

