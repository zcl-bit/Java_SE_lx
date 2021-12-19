package TwoColorBall;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //声明数组，用来接收7个球的数字：
        int[] balls = new int[7];
        //定义购买注数
        int count = 0;
        //定义一个变量，用来设定是否购买彩票
        boolean isBuy = false;//默认没买
        while (true) {
            System.out.println("-------欢迎进入双色球彩票系统-------");
            System.out.println("1、购买彩票");
            System.out.println("2、查看开奖");
            System.out.println("3、退出");
            System.out.println("请选择你要完成的功能：");
            Scanner sc = new Scanner(System.in);
            int features = sc.nextInt();
            switch (features) {
                case 1:
                    System.out.println("双色球系统》》购买彩票");
                    System.out.println("请输入您需要购买多少注：");
                    count = sc.nextInt();//购买数量
                    for (int i = 1; i < 8; i++) {
                        if (i != 7) {//录入红色球
                            System.out.println("请选择6个红球，第" + i + "个红球为：红球在" +
                                    "1-33之间");
                            int redBall = sc.nextInt();
                            balls[i - 1] = redBall;
                        } else {//录入蓝色球
                            System.out.println("请选择一个蓝球，蓝球为：" +
                                    "（蓝球在1-16之间）");
                            int blueBall = sc.nextInt();
                            balls[6] = blueBall;
                        }
                    }
                    //提示完整信息
                    System.out.println("您购买了" + count + "注彩票，一共消费了" + count * 2
                            + "元钱，您购买的彩票号码为：");
                    for (int num : balls) {
                        System.out.print(num + "\t`");
                    }
                    System.out.println();
                    //彩票购买
                    isBuy = true;
                    break;
                case 2:
                    if (isBuy){
                        //1、购买号码->balls

                        //2、中奖号码->随机数
                        int[] luckyBall = getLuckyBall();
                        //3、将两组号码进行比对
                        int level = getLevel(balls, luckyBall);
                        //4、根据level的结果执行后面的逻辑：
                        switch (level) {
                            case 1:
                                System.out.println("恭喜你，中了一等奖，1注奖金500万，您一共获得："
                                        + 500 * count + "万元");
                                break;
                            case 2:
                                System.out.println("恭喜你，中了二等奖，1注奖金200万，您一共获得："
                                        + 200 * count + "万元");
                                break;
                            case 3:
                                System.out.println("恭喜你，中了三等奖，1注奖金100万，您一共获得："
                                        + 100 * count + "万元");
                                break;
                            case 4:
                                System.out.println("恭喜你，中了四等奖，1注奖金50万，您一共获得："
                                        + 50 * count + "万元");
                                break;
                            case 5:
                                System.out.println("恭喜你，中了五等奖，1注奖金20万，您一共获得："
                                        + 20 * count + "万元");
                                break;
                            case 6:
                                System.out.println("恭喜你，中了六等奖，1注奖金1万，您一共获得："
                                        + count + "万元");
                                break;

                        }
                        System.out.println("双色球系统》》查看开奖");
                        System.out.println("中奖号码为：");
                    }else {//如果没有买彩票，就给提示
                        System.out.println("对不起，请先购买彩票");

                    }
                    break;
                case 3:
                    System.out.println("双色球系统》》退出");
                    return;
            }
        }
    }

    //定义一个方法，专门用来生成中奖号码：
    public static int[] getLuckyBall() {

        /*
         * 生成随机数组
         * 红球：1-33
         * 蓝球：1-16
         * */
        int[] luckyBall = new int[7];
        for (int i = 1; i <= 7; i++) {
            if (i != 7) {//给红球赋值
                luckyBall[i - 1] = (int) (Math.random() * 33 + 1);//生成1-33的随机数
            } else {//给蓝球赋值
                luckyBall[i - 1] = (int) (Math.random() * 16 + 1);//生成1-16的随机数
            }
        }
        return luckyBall;
    }

    //定义一个方法，专门用来比对购买号码和中奖号码的
    public static int getLevel(int[] balls, int[] luckyBall) {
        int level = 1;
        //计数器：用来记录红球相等个数
        int redCount = 0;
        //计数器：用来记录蓝球相等个数
        int blueCount = 0;
        for (int i = 0; i <= 6; i++) {
            if (i != 6) {//红色球
                for (int j = 0; j <= 5; j++) {
                    if (luckyBall[j] == balls[i]) {
                        redCount++;
                    }
                }
            } else {//蓝色球
                if (balls[6] == luckyBall[6]) {
                    blueCount++;
                }
            }
        }
        //输出比对结果
        System.out.println("红球有" + redCount + "个相等");
        System.out.println("蓝球有" + blueCount + "个相等");
        //根据红球和蓝球和相等数量，得到level的具体结果
        if (redCount == 6 && blueCount == 1) {
            level = 1;
        } else if (redCount == 6) {
            level = 2;
        } else if (redCount == 5 && blueCount == 1) {
            level = 3;
        } else if (redCount == 5 || (redCount ==4 && blueCount ==1)) {
            level = 4;
        } else if (redCount == 4 || (redCount ==3 && blueCount ==1)) {
        }else {
            level = 6;
        }
        return level;
    }
}
