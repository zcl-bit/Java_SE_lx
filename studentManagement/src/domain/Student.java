package domain;

import utils.Utils;

/**
 * @author: zcl
 * @create: 2021/12/29 16:40
 */
public class Student extends Person{
    {
        //构造代码块，调用构造方法的时候执行，并且在构造方法执行之前执行
        Utils.sid++;
    }

    public Student() {
    }

    public Student(int id, String name, String sex, String birthday, int age) {
        super(id, name, sex, birthday, age);
    }

    @Override
    public String getType() {
        return "学生";
    }

    @Override
    public String getWork() {
        return "学Java----";
    }
}
