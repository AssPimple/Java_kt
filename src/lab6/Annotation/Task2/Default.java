package lab6.Annotation.Task2;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Определение аннотации @Default
@Target({ElementType.TYPE, ElementType.FIELD}) // Цель - типы и поля
@Retention(RetentionPolicy.RUNTIME) // Доступна во время выполнения
public @interface Default {
    Class<?> value(); // Обязательное свойство value типа Class
}