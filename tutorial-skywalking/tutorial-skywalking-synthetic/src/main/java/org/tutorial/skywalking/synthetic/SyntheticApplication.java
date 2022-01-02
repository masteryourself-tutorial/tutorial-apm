package org.tutorial.skywalking.synthetic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * <p>description : SyntheticApplication
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/1/3 1:19 AM
 */
public class SyntheticApplication {

    /**
     * synthetic 关键字是由 Java 编译器在编译阶段自动生成的, 为了保证语法规范, 编译器会自动生成一些 synthetic 类型的方法
     * JLS: 所有存在于字节码文件中, 但是不存在于源代码文件中的[构造], 都应该被 synthetic 关键字标注
     * [构造] ==> Constructs ==> Field, Method, Construct
     * <p>
     * 可以手动使用 [javac Demo.java] 编译, 就可以看到编译后的代码引用
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        fieldSynthetic();
        methodSynthetic();
        constructSynthetic();
    }

    private static void fieldSynthetic() {
        Field[] fields = FieldDemo.FieldDemoInner.class.getDeclaredFields();
        for (Field field : fields) {
            // final org.tutorial.skywalking.synthetic.FieldDemo org.tutorial.skywalking.synthetic.FieldDemo$FieldDemoInner.this$0 : true
            // 也就是说 this$0 是编译器帮我们自动生成的
            System.out.println(field.toGenericString() + " : " + field.isSynthetic());
        }
    }

    private static void methodSynthetic() {
        Method[] methods = MethodDemo.MethodDemoInner.class.getDeclaredMethods();
        for (Method method : methods) {
            // static java.lang.String org.tutorial.skywalking.synthetic.MethodDemo$MethodDemoInner.access$000(org.tutorial.skywalking.synthetic.MethodDemo$MethodDemoInner) : true
            // static java.lang.String org.tutorial.skywalking.synthetic.MethodDemo$MethodDemoInner.access$002(org.tutorial.skywalking.synthetic.MethodDemo$MethodDemoInner,java.lang.String) : true
            System.out.println(method.toGenericString() + " : " + method.isSynthetic());
        }
    }

    private static void constructSynthetic() {
        Constructor<?>[] constructors = ConstructDemo.ConstructDemoInner.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            // oprivate org.tutorial.skywalking.synthetic.ConstructDemo$ConstructDemoInner() : false
            // org.tutorial.skywalking.synthetic.ConstructDemo$ConstructDemoInner(org.tutorial.skywalking.synthetic.ConstructDemo$1) : true
            System.out.println(constructor.toGenericString() + " : " + constructor.isSynthetic());
        }
    }

}
