public class Teacher {
    String name;
    int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Teacher() {
        System.out.println("new-------");
    }

    public void teach() {
        System.out.println("上课");
    }


    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "连";
        teacher.age = 18;
        System.out.println(teacher.age);
        System.out.println(teacher.name);
        Teacher teacher1 = new Teacher("李四", 20);
        System.out.println(teacher1.age);
        System.out.println(teacher1.name);
    }
}
