package lab6.Annotation.Task3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Определение аннотации @ToString
@Target({ElementType.TYPE, ElementType.FIELD}) // Цель - типы и поля
@Retention(RetentionPolicy.RUNTIME) // Доступна во время выполнения
public @interface ToString {
    String value() default "YES"; // Необязательное свойство с значением по умолчанию YES
}