package BranchingStructure;

public class IfDemo {
    public static void main(String[] args) {
        int age = (int)(Math.random()*100);
        if (age<10){
            System.out.println("儿童");
        }else if(age<20){
            System.out.println("少年");
        }else if (age<30){
            System.out.println("青年");
        }else if (age<50){
            System.out.println("中年");
        }else if (age<70){
            System.out.println("老年");
        }else{
            System.out.println("耄耋");
        }
    }
}
