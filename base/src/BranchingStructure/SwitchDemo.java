package BranchingStructure;

public class SwitchDemo {
    public static void main(String[] args) {
        int random = (int)(Math.random()*26);
        char ch = (char) ('a'+random);
        switch (ch){
            case 'a':

            case 'e':

            case 'i':

            case 'o':

            case 'u':
                System.out.println("元音："+ch);
                break;
            case 'y':

            case 'w':
                System.out.println("半元音："+ch);
                break;
            default:
                System.out.println("辅音："+ch);
                break;
        }
    }
}
