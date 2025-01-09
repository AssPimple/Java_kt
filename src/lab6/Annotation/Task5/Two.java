package lab6.Annotation.Task5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Определение аннотации @Two
@Target(ElementType.TYPE) // Цель - типы
@Retention(RetentionPolicy.RUNTIME) // Доступна во время выполнения
public @interface Two {
    String first(); // Обязательное свойство типа String
    int second();   // Обязательное свойство типа int
}