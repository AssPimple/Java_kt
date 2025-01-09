package lab6.AnnotationProcessing;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Определение аннотации @ToString
@Target(ElementType.FIELD) // Цель - поля
@Retention(RetentionPolicy.RUNTIME) // Доступна во время выполнения
public @interface ToString2 {
    String value(); // Значение аннотации (YES или NO)
}