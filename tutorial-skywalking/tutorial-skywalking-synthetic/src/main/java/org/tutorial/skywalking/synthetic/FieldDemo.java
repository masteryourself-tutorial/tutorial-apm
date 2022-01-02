package org.tutorial.skywalking.synthetic;

/**
 * <p>description : FieldDemo
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/1/3 1:20 AM
 */
public class FieldDemo {

    public String say() {
        return "hello synthetic";
    }

    class FieldDemoInner {

        // 在这里定义了一个变量
        // final FieldDemo this$0;

        public void print() {
            // 这里并未定义 FieldDemo 对象, 但却可以直接调用 say() 方法, 实际上是通过 this.this$0.say() 调用
            System.out.println(say());
        }

    }

}
