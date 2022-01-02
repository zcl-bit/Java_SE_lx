package proxy;

/**
 * @author: zcl
 * @create: 2022/1/2 8:36
 */
public class XiMenQing {
    public static void main(String[] args) {

//        WangPo wangPo = new WangPo();
//        wangPo.playWithMen();
//        wangPo.makeEyesWithMen();

        JiaShi jiaShi = new JiaShi();
        WangPo wangPo = new WangPo(jiaShi);
        wangPo.makeEyesWithMen();
        wangPo.playWithMen();

    }
}