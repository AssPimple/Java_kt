package lab6.Annotation.Task1;

import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) {
        Example example = new Example();

        // Получаем все методы класса Example
        Method[] methods = Example.class.getDeclaredMethods();

        for (Method method : methods) {
            // Проверяем, есть ли аннотация @Invoke
            if (method.isAnnotationPresent(Invoke.class)) {
                try {
                    // Вызываем метод, если он аннотирован
                    method.invoke(example);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}