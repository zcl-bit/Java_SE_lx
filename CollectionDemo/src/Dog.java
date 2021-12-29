import java.util.Objects;

/**
 * @author: zcl
 * @create: 2021-12-29 16:29
 */
public class Dog {
    private String name;
    private String color;

    public Dog(){

    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) &&
                Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, color);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
