package domain;

/**
 * @author: zcl
 * @create: 2021/12/29 16:40
 */
public class Student extends Person{
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
