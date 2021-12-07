package BranchingStructure;

public class IfIfDemo {
    public static void main(String[] args) {
        int time = (int)(Math.random()*40);
        if(time<20){
            System.out.println("恭喜进入决赛");
            String sex = ((int)(Math.random()*2))==0?"girl":"boy";
            if (sex == "girl"){
                System.out.println("欢迎进入女子组");
            }else {
                System.out.println("欢迎进入男子组");
            }
        }else{
            System.out.println("成绩太差，被淘汰");
        }
    }


}
