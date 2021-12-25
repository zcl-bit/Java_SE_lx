/**
 * @author zcl
 * @date 2021/12/25 14:30
 */
public class PetTest {
    public static void main(String[] args) {
        Dog dog = new Dog("xiaohei",12,"nan","汪汪");
        dog.setName("大黄");
        System.out.println(dog.getName());
        dog.play();

    }

}
