/**
 * @author: zcl
 * @create: 2021/12/26 9:14
 */
/**
 * 多态：对应同一个指令，不同的对象给予不同的反应
 * 规范：
 *  1、必须要有继承关系
 *  2、子类方法必须重写父类的方法
 *  3、父类引用指向子类对象
 *
 *
 * */
//public class Person extends Pet {
public class Person {

    //重复方法进行抽象和封装提取
//    public void feed(Cat cat) {
//        cat.feed();
//    }
//
//    public void feed(Dog dog) {
//        dog.feed();
//    }

    //父类作为方法形参实现多态
    public void feed(Pet pet){
        pet.feed();
    }

    //此时猫和狗play方法一致，多态使用不建议
//    public void play(Pet pet){
//        pet.play();
//    }

    //父类作为方法返回值实现多态
    public Pet buyPet(int type){
        if (type == 1){
            return new Dog();
        }else if (type == 2){
            return new Cat();
        }else {
            return new Penguin();
        }
    }
    public static void main(String[] args) {
        Person p = new Person();
        Pet dog = new Dog();
        Pet cat = new Cat();
        Pet penguin = new Penguin();
        p.feed(dog);
        p.feed(cat);
        p.feed(penguin);
        Pet pet = p.buyPet(1);
        if (pet instanceof Dog){
            System.out.println("买的是一只狗");
        } else if (pet instanceof Cat) {
            System.out.println("买的是一只猫");
        }else {
            System.out.println("买的是一只企鹅");
        }

//
//        p.play(dog);
//        p.play(cat);
//      person类想要实现dog对象需要继承pet类，并重写feed方法
//        Person p1 = (Person)dog;
//    }
//
//    @Override
//    public void feed() {
//
//    }
    }
}
