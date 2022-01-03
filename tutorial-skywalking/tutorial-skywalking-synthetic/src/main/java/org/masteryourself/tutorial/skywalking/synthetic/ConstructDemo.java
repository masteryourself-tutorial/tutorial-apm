package org.masteryourself.tutorial.skywalking.synthetic;

/**
 * <p>description : ConstructDemo
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/1/3 2:11 AM
 */
public class ConstructDemo {

    // 这里还能够继续使用 new 构造, 实际上用的是 synthetic 构造器
    public ConstructDemoInner constructDemoInner = new ConstructDemoInner();

    static class ConstructDemoInner {
        // 这里已经定义成私有构造函数了
        private ConstructDemoInner() {
        }

        // 相当于这里生成了一个 synthetic 类型的构造器
//        ConstructDemoInner(ConstructDemo demo){
//
//        }
    }

}
