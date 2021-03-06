import java.util.Objects;

/**
 * @author: zcl
 * @create: 2021-12-29 15:32
 */
public class Person implements Comparable{
    private String name;
    private int age;

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    /**
     * 此比较器按照name的长度来进行比较
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        Person p  = (Person) o;
        if (p.name.length()>this.name.length()){
            //最短的在前面
            return -1;
            //最长的在前面
            //return 1;
        }else if(p.name.length()<this.name.length()){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
