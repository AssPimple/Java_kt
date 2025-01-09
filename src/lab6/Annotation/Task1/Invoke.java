package lab6.Annotation.Task1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
// Определение аннотации @Invoke
@Target(ElementType.METHOD) // Цель - только методы
@Retention(RetentionPolicy.RUNTIME) // Доступна во время выполнения
public @interface Invoke {
}
