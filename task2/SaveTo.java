package homework.prog.task2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.file.Paths;

@Target(value = ElementType.TYPE)
@Retention( value = RetentionPolicy.RUNTIME)
public @interface SaveTo {
    String path();
}
