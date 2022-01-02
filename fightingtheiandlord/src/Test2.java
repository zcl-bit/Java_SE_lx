/**
 * @author: zcl
 * @create: 2022/1/2 16:36
 */
import java.util.*;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 16:37
 */
public class Test2 {
    public static void main(String[] args) {
        // 1.造牌:
        // 1.1 创建Map集合,键的类型为Integer,值的类型为String
        Map<Integer, String> map = new HashMap<>();

        // 1.2 创建花色单列集合,用来存储4个花色
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors, "♠", "♥", "♣", "♦");

        // 1.3 创建牌面值单列集合,用来存储13个牌面值
        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(numbers, "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        // 1.4 定义一个int类型的变量,表示标记,默认值为0
        int mark = 0;

        // 1.5 标记作为键,大王作为值,添加到Map集合中,标记+1
        map.put(mark++, "大王");

        // 1.6 标记作为键,小王作为值,添加到Map集合中,标记+1
        map.put(mark++, "小王");

        // 1.7 花色和牌面值集合循环嵌套遍历-->一定是牌面值作为外层循环
        for (String number : numbers) {
            for (String color : colors) {
                // 1.8 在循环中,创建牌
                String pai = color + number;
                // 1.9 标记作为键,牌作为值,添加到Map集合中,标记+1
                map.put(mark++, pai);
            }
        }

        System.out.println(map);
        System.out.println(map.size());// 54

        // 2.洗牌: 洗标记
        // 2.1 获取所有牌的标记(Set集合)
        Set<Integer> keys = map.keySet();

        // 2.2 把所有牌标记的Set集合转换为List集合
        ArrayList<Integer> markList = new ArrayList<>();
        markList.addAll(keys);

        // 2.3 对标记进行打乱顺序
        // shuffle(List<?> list)
        Collections.shuffle(markList);
        System.out.println(markList);
        System.out.println(markList.size());// 54

        // 3.发牌
        // 3.1 创建4个单列集合,用来分别存储玩家1,玩家2,玩家3,底牌的牌的标记
        ArrayList<Integer> play1Mark = new ArrayList<>();
        ArrayList<Integer> play2Mark = new ArrayList<>();
        ArrayList<Integer> play3Mark = new ArrayList<>();
        ArrayList<Integer> diPaiMark = new ArrayList<>();

        // 3.2 循环遍历打乱顺序之后的标记
        for (int i = 0; i < markList.size(); i++) {
            // 获取标记
            Integer paiMark = markList.get(i);

            // 3.3 判断标记的索引
            if (i >= 51) {
                // 3.4 如果标记的索引>=51,那么该标记就给底牌
                diPaiMark.add(paiMark);

            } else if (i % 3 == 0) {
                // 3.4 如果标记的索引%3==0,那么该标记就给玩家1
                play1Mark.add(paiMark);

            } else if (i % 3 == 1) {
                // 3.4 如果标记的索引%3==1,那么该标记就给玩家2
                play2Mark.add(paiMark);

            } else if (i % 3 == 2) {
                // 3.4 如果标记的索引%3==2,那么该标记就给玩家3
                play3Mark.add(paiMark);

            }

        }
        // 4.5 每个玩家都对标记进行从小到大进行排序--升序
        Collections.sort(play1Mark);
        Collections.sort(play2Mark);
        Collections.sort(play3Mark);
        Collections.sort(diPaiMark);

        // 4.6 根据排好序的标记去Map集合中取牌
        // 4.6.1 创建4个单列集合,用来分别存储玩家1,玩家2,玩家3,底牌的牌
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        // 4.6.2 循环遍历玩家牌标记的集合
        for (Integer paiMark : play1Mark) {
            // 根据牌的标记去Map集合中获取牌
            String pai = map.get(paiMark);
            // 把pai添加到集合中
            play1.add(pai);
        }

        for (Integer paiMark : play2Mark) {
            // 根据牌的标记去Map集合中获取牌
            String pai = map.get(paiMark);
            // 把pai添加到集合中
            play2.add(pai);
        }

        for (Integer paiMark : play3Mark) {
            // 根据牌的标记去Map集合中获取牌
            String pai = map.get(paiMark);
            // 把pai添加到集合中
            play3.add(pai);
        }

        for (Integer paiMark : diPaiMark) {
            // 根据牌的标记去Map集合中获取牌
            String pai = map.get(paiMark);
            // 把pai添加到集合中
            diPai.add(pai);
        }

        // 展示牌
        System.out.println("玩家1:"+play1+",数量:"+play1.size());
        System.out.println("玩家2:"+play2+",数量:"+play2.size());
        System.out.println("玩家3:"+play3+",数量:"+play3.size());
        System.out.println("底牌:"+diPai);
    }
}

