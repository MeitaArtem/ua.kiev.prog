package homework.prog.task1;

import java.lang.reflect.Method;

public class Tester {
    public static void main(String[] args) {
        try {
            Class<Test> testClass = Test.class;
            Method[] declaredMethods = testClass.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (method.isAnnotationPresent(MyTest.class)) {
                    MyTest annotation = method.getAnnotation(MyTest.class);
                    method.invoke(null, annotation.a(), annotation.b());
                }
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}