package lab6.Annotation.Task4;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Определение аннотации @Validate
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE}) // Цель - типы и аннотации
@Retention(RetentionPolicy.RUNTIME) // Доступна во время выполнения
public @interface Validate {
    Class<?>[] value(); // Обязательное свойство value типа Class[]
}