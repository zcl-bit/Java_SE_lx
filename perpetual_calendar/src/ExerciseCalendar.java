import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2021/12/29 6:54
 */
public class ExerciseCalendar {
        public static void main(String[] args) throws ParseException {
            //欢迎界面
            System.out.println("欢迎来到周晨靓的万年历小程序");
            //1.创建解析日期的格式
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            //2.键盘录入数据
            System.out.println("请输入您的日期(格式为yyyy-MM-dd)");
            Scanner in = new Scanner(System.in);
            String strDate = in.next();
            ///   String strDate = "2020-7-6";

            //3.将字符串数据==》date
            Date date = df.parse(strDate);

            //4.calendar与Date产生关联
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            //5.记录日期
            int day = calendar.get(Calendar.DATE);
            //6.将当前日期变为1号
            calendar.set(Calendar.DATE, 1);

            //7.输出表头
            System.out.println("日\t一\t二\t三\t四\t五\t六");
            int num = calendar.get(Calendar.DAY_OF_WEEK);
            //8.输出空格
            for (int i = 1; i < num; i++) {
                System.out.print("\t");
            }
            //9.输出数字

            int maxDay = calendar.getActualMaximum(Calendar.DATE);
            //System.out.println(maxDay);
            for (int i = 1; i <= maxDay; i++) {
                //输出每一个数字
                if (i == day) {
                    System.out.print("*" + i + "\t");
                } else {
                    System.out.print(i + "\t");
                }

                //  System.out.println("===="+calendar.get(Calendar.DATE));

                if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                    System.out.println();
                }
                //日期+1
                calendar.add(Calendar.DATE, 1);
            }

        }
    }

