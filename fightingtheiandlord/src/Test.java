import java.util.ArrayList;
import java.util.Collections;

/**
 * @author: zcl
 * @create: 2022/1/2 16:37
 */
public class Test {
    public static void main(String[] args) {
        // 1.造牌:
        // 1.1 创建一个pokerBox集合,用来存储54张扑克牌
        ArrayList<String> pokerBox = new ArrayList<>();

        // 1.2 创建一个ArrayList牌面值集合,用来存储13个牌面值
        ArrayList<String> numbers = new ArrayList<>();

        // 1.3 创建一个ArrayList花色集合,用来存储4个花色
        ArrayList<String> colors = new ArrayList<>();

        // 1.4 往牌面值集合中添加13个牌面值
        numbers.add("A");
        numbers.add("K");
        numbers.add("Q");
        numbers.add("J");
        for (int i = 2; i <= 10; i++) {
            numbers.add(i + "");
        }

        // 1.5 往花色集合中添加4个花色
        colors.add("♥");
        colors.add("♠");
        colors.add("♣");
        colors.add("♦");

        // 1.6 添加大小王到存储到pokerBox集合中
        pokerBox.add("大王");
        pokerBox.add("小王");

        // 1.7 花色集合和牌面值集合,循环嵌套
        for (String number : numbers) {
            for (String color : colors) {
                // 1.8 在循环里面创建牌,并添加到pokerBox集合中
                String pai = color + number;
                pokerBox.add(pai);
            }
        }
        // 1.9 打印pokerBox集合
        System.out.println(pokerBox);
        System.out.println(pokerBox.size());

        // 2.洗牌:
        // 使用Collections工具类的静态方法
        // public static void shuffle(List<?> list)
        // 打乱集合元素的顺序
        Collections.shuffle(pokerBox);
        System.out.println("打乱顺序后:" + pokerBox);
        System.out.println("打乱顺序后:" + pokerBox.size());

        // 3.发牌
        // 3.1 创建4个ArrayList集合,分别用来存储玩家1,玩家2,玩家3,底牌的牌
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        // 3.2 循环遍历打乱顺序之后的牌
        for (int i = 0; i < pokerBox.size(); i++) {
            // 3.3 在循环中,获取遍历出来的牌
            String pai = pokerBox.get(i);
            // 3.4 在循环中,判断遍历出来的牌:
            if (i >= 51) {
                // 3.5 如果该牌的索引是51,52,53,给底牌
                diPai.add(pai);
            } else if (i % 3 == 0) {
                // 3.5 如果该牌的索引%3==0,给玩家1
                play1.add(pai);
            } else if (i % 3 == 1) {
                // 3.5 如果该牌的索引%3==1,给玩家2
                play2.add(pai);
            } else if (i % 3 == 2) {
                // 3.5 如果该牌的索引%3==2,给玩家3
                play3.add(pai);
            }
        }
        // 3.6 打印各自的牌
        System.out.println("玩家1:"+play1+",牌数:"+play1.size());
        System.out.println("玩家2:"+play2+",牌数:"+play2.size());
        System.out.println("玩家3:"+play3+",牌数:"+play3.size());
        System.out.println("底牌:"+diPai);
    }
}
