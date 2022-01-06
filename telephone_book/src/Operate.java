import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author: zcl
 * @create: 2022/1/6 10:27
 * 核心业务类
 */
public class Operate {
    private List<Person> list ;
    public Operate(){
        this.list = new ArrayList<>();
    }
    /**
     * 用户添加记录业务逻辑控制
     */
    public void addLogic(){

    }

    /**
     * 用户查询记录业务逻辑控制
     */
    public void searchLogic(){

    }

    /**
     * 修改记录业务逻辑控制
     */
    public void modifyLogic(){

    }

    /**
     * 删除记录业务逻辑控制
     */
    public void deleteLogic(){

    }

    /**
     *  排序记录业务逻辑控制
     */
    public void orderLogic(){

    }

    /**
     * 添加新记录信息
     */
    public void addOperation(){

    }

    /**
     * 查询全部记录
     */
    public void showAll(){

    }
    /**
     * 按姓名查询记录
     */
    public void searchByName(){

    }
    /**
     * 按年龄查询记录
     */
    public void searchByAge(){

    }

    /**
     * 按性别查询记录
     */
    public void searchBySex(){

    }
    /**
     * 按电话号码查询记录
     */
    public void searchByTelNum(){

    }
    /**
     * 按地址查询记录
     */
    public void searchByAdd(){

    }
    /**
     * 修改指定记录
     */
    public void modifyOperation(){

    }
    /**
     * 删除指定记录
     */
    public void deleteOperation(){

    }
    /**
     * 删除全部记录
     */
    public void deleteAllOperation(){

    }

    /**
     * 按用户姓名排序记录
     */
    public void orderName(){

    }
    /**
     * 按用户年龄排序记录
     */
    public void orderAge(){

    }

    /**
     * 按用户性别排序记录
     */
    public void orderSex(){

    }

    /**
     * 按姓名排序的比较器
     */
    class OrderByName implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return 0;
        }
    }

    /**
     * 按年龄排序的比较器
     */
    class OrderByAge implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            return 0;
        }
    }

    /**
     * 按性别排序的比较器
     */
    class OrderBySex implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            return 0;
        }
    }
}
