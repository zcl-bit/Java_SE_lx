/**
 * @author: zcl
 * @create: 2021-12-29 16:44
 */
public class FanXingMethod<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <Q> void show(Q q){
        System.out.println(q);
        System.out.println(t);
    }
}
