package com.zcl;

/**
 * 在Java中明确定义了访问权限:
 * 限制访问，以下分类按照从大到小进行排列
 * –public 公共的：
 * 当前项目的所有的类都可以进行访问，可以被项目中所有的类访问。(项目可见性)
 * –protected 受保护的：
 * 可以被当前类访问，可以被当前包访问，也可以被子类访问
 * –default／friendly 默认的/友好的（包可见性）：
 * 可以被当前包和当前类访问
 * –private 私有的：
 * 只能被当前类访问（类可见性）
 */
public class AccessControlDemo {
    public AccessControlDemo() {

    }

    public AccessControlDemo(int a, int b) {

    }

    private String str = "test";
}

class test {

}
