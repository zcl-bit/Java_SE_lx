package BranchingStructure;

public class IfTest01 {
    public static void main(String[] args) {
        int i = (int)(6*Math.random())+1;
        int j = (int)(6*Math.random())+1;
        int k = (int)(6*Math.random())+1;
        int count = i + j + k;
        if (count > 15){
            System.out.println("今天手气不错");
        }else if (count > 15 && count <= 15){
            System.out.println("今天手气很一般");
        }else {
            System.out.println("今天手气不怎么样");
        }
        System.out.println("第一个骰子"+ i + "第二个骰子" + j + "第三个骰子" + k + "得了" + count + "分");
    }
}
