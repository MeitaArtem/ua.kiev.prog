package homework.prog.task2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TextContainer textContainer = new TextContainer();
        Class<TextContainer> textContainerClass = TextContainer.class;

        Method[] declaredMethods = textContainerClass.getDeclaredMethods();
            for(Method method : declaredMethods){
                if(method.isAnnotationPresent(Saver.class)){

                    SaveTo annotation = textContainerClass.getAnnotation(SaveTo.class);

                    method.invoke(textContainer,annotation.path());

                }
            }
    }
}
