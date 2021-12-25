/**
 * @author zcl
 *
 *
 * */

public class Dog extends Pet {
/*    private String name;
    private int age;
    private String gender;*/
    private String sound;

    public Dog() {
        System.out.println("dog 无参构造方法");
    }

    public Dog(String name, int age, String gender, String sound) {
        super(name, age, gender);
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
        this.sound = sound;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName() {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge() {
//        this.age = age;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    @Override
    public void play(){
        super.play();
        System.out.println("dog is playing");
    }

    @Override
    public String toString() {
        super.toString();
        return "Dog{" +
                "sound='" + sound + '\'' +
                '}';
    }
}
