/**
 * @author zcl
 * @date 2021/12/25 16:33
 */
public abstract class Pet {
    private String name;
    private int age;
    public abstract void print();

    public void play(){
        System.out.println("play------");
    }
}
