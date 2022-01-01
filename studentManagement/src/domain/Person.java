package domain;

/**
 * @author: zcl
 * @create: 2021/12/29 16:40
 */
public abstract class Person {
    /**
     * 编号
     * */
    private int id;
    /**
     * 姓名
     * */
    private String name;
    /**
     * 性别
     * */
    private String sex;
    /**
     * 生日
     * */
    private String birthday;
    /**
     * 年龄
     * */
    private int age;

    public Person() {
    }

    public Person(int id, String name, String sex, String birthday, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //通用模板
    public String show(){
        return "我是一名：" + getType() + "，我的工作是："+ getWork();
    }
    //填充模板
    public abstract String getType();
    public abstract String getWork();
}
