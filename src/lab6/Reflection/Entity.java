package lab6.Reflection;

import java.lang.reflect.Field;


abstract class Entity {
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName()).append("(");

        // Получаем поля текущего класса и родительских классов
        Field[] fields = getClass().getDeclaredFields();
        Class<?> superclass = getClass().getSuperclass();

        // Сначала обрабатываем поля текущего класса
        for (Field field : fields) {
            field.setAccessible(true); // Делаем поле доступным
            try {
                sb.append(field.getName()).append("=").append(field.get(this)).append(", ");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        // Теперь обрабатываем поля родительского класса
        while (superclass != null) {
            Field[] superFields = superclass.getDeclaredFields();
            for (Field field : superFields) {
                field.setAccessible(true); // Делаем поле доступным
                try {
                    sb.append(field.getName()).append("=").append(field.get(this)).append(", ");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
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
