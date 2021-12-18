package Method;

public class LaterMethod {
    /*
    *
    * 输入参数：员工名称，月薪
    * 处理逻辑：
    *   迟到1-10分钟，警告
    *   迟到11-20分钟，罚款100元
    *   迟到21-30分钟，罚款200元
    *   迟到30分钟以上，扣除半日工资
    *   迟到1小时以上，按照旷工计算，扣除3日工资
    * 输出罚款金额和处理意见
    *
    *
    *
    * */

    public static int late(int lateMinute,double salary){
        //定义罚款变量
        int fine = 0;
        //迟到1-10分钟，警告
        if (lateMinute <= 10){
            System.out.println("警告！");
        }else if (lateMinute <= 20){//迟到11-20分钟，罚款100元
            fine = 100;
        }else if (lateMinute <= 30){//迟到21-30分钟，罚款200元
            fine = 200;
        }else if (lateMinute <= 60){//迟到30分钟以上，扣除半日工资
            fine = (int)(salary/21.75/2);
        }else {
            fine = (int)((salary/21.75)*3);//迟到1小时以上，按照旷工计算，扣除3日工资
        }
        //输出罚款金额和处理意见
        System.out.println("迟到时间：" + lateMinute + "分钟" + "\t" +"罚款：" + fine);
        return fine;
    }

    public static void main(String[] args) {
        late(25,12000);
        late(45,12000);
    }
}
