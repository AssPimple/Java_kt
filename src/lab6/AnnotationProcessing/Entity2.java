package lab6.AnnotationProcessing;

import lab6.AnnotationProcessing.*;

import java.lang.reflect.Field;

public abstract class Entity2 {
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName()).append("(");

        Field[] fields = getClass().getDeclaredFields();
        Class<?> superclass = getClass().getSuperclass();

        // Сначала обрабатываем поля текущего класса
        for (Field field : fields) {
            ToString2 annotation = field.getAnnotation(ToString2.class);
            if (annotation == null || "YES".equals(annotation.value())) {
                field.setAccessible(true); // Делаем поле доступным
                try {
                    sb.append(field.getName()).append("=").append(field.get(this)).append(", ");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        // Теперь обрабатываем поля родительского класса
        while (superclass != null) {
            Field[] superFields = superclass.getDeclaredFields();
            for (Field field : superFields) {
                ToString2 annotation = field.getAnnotation(ToString2.class);
                if (annotation == null || "YES".equals(annotation.value())) {
                    field.setAccessible(true); // Делаем поле доступным
                    try {
                        sb.append(field.getName()).append("=").append(field.get(this)).append(", ");
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }

        // Удаляем последнюю запятую и пробел, если они есть
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }

        sb.append(")");
        return sb.toString();
    }
}

