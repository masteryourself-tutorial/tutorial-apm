package org.tutorial.skywalking.synthetic;

/**
 * <p>description : MethodDemo
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/1/3 1:40 AM
 */
public class MethodDemo {

    static class MethodDemoInner {

        private String innerName;

        // 类似于在这里了两个方法
//        public static String access$000(MethodDemoInner methodDemoInner) {
//            return methodDemoInner.innerName;
//        }
//
//        public static void access$002(MethodDemoInner methodDemoInner, String innerName) {
//            methodDemoInner.innerName = innerName;
//        }

    }

    public String getInnerName() {
        // 通过 new 出来的内部对象可以直接访问 private 属性
        // 类似于 return MethodDemoInner.access$000(new MethodDemoInner());
        return new MethodDemoInner().innerName;
    }

    public void setInnerName(String innerName) {
        // 类似于 MethodDemoInner.access$002(new MethodDemoInner(), innerName);
        new MethodDemoInner().innerName = innerName;
    }

}
