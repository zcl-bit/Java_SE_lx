/**
 * @author: zcl
 * @create: 2022/1/6 10:27
 * 实体类
 */
public class Person {
    private int id;
    private String name;
    private String age;
    private String sex;
    private String telNum;
    private String address;

    public Person() {
    }

    public Person(String name, String age, String sex, String telNum, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.telNum = telNum;
        this.address = address;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("序号").append(this.id).append("#").append("\t");
        sb.append("姓名").append(this.name).append("\t\t");
        sb.append("年龄").append(this.age).append("\t\t");
        sb.append("性别").append(this.sex).append("\t\t");
        sb.append("电话号码").append(this.telNum).append("\t\t");
        sb.append("地址").append(this.address);
        return sb.toString();
    }
}
