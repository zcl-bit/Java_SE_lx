package domain;

/**
 * @author: zcl
 * @create: 2021/12/29 16:41
 */
public class Teacher extends Person{

    @Override
    public String getType() {
        return "老师";
    }

    @Override
    public String getWork() {
        return "教Java---";
    }
}
