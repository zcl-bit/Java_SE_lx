package com.zcl.homework;

public class Dog {
    String name;
    int health;
    int love;
    String strain;

    public Dog(){

    }
    public Dog(String name,String strain){
        this.name = name;
        this.strain = strain;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setHealth(int health){
        if (health <=0 || health >100)
        {
            System.out.println("您选择的宠物的健康值有问题请检查");
        }else {

            this.health = health;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public int getLove() {
        return love;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public String getStrain() {
        return strain;
    }
}
