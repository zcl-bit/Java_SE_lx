/**
 * @author: zcl
 * @create: 2021/12/28 14:49
 */
public class Test {
    Gender gender = Gender.nv;
    Gender gender2 = Gender.nan;

    public static void main(String[] args) {

        EventEnum eventEnum = EventEnum.LAUNCH;
        eventEnum.show();
        String name = EventEnum.PAGEVIEW.name();
        System.out.println(name);
    }

}
