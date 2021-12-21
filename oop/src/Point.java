public class Point {
    int x;
    int y;

    //设置二维的坐标点
    public void set(int xx, int yy) {
        x = xx;
        y = yy;

    }

    public double calcDistance(Point p) {
        return Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y));
    }

    public void changePoint(Point p) {
        int a = p.x;
        p.x = x;
        x = a;
        int b = p.y;
        p.y = y;
        y = b;

    }

    public void show() {
        System.out.println("[" + x + "," + y + "]");
    }

    public static void main(String[] args) {
        Point point = new Point();
        point.set(3, 5);
        Point point1 = new Point();
        point1.set(2, 4);
        System.out.println(point.calcDistance(point1));
        point.changePoint(point1);
        point.show();
        point1.show();
    }
}
