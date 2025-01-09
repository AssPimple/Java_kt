package lab6.Annotation.Task6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Определение аннотации @Cache
@Target(ElementType.TYPE) // Цель - типы (классы)
@Retention(RetentionPolicy.RUNTIME) // Доступна во время выполнения
public @interface Cache {
    String[] value() default {}; // Необязательное свойство типа String[], по умолчанию - пустой массив
}
