package lab6;

import lab6.Annotation.Task1.Example;
import lab6.Annotation.Task1.Invoke;
import lab6.Annotation.Task2.Default;
import lab6.Annotation.Task2.ExampleClass;
import lab6.Annotation.Task3.Person;
import lab6.Annotation.Task3.ToString;
import lab6.Annotation.Task4.User;
import lab6.Annotation.Task4.Validate;
import lab6.Annotation.Task5.ExampleClass2;
import lab6.Annotation.Task5.Two;
import lab6.Annotation.Task6.Cache;
import lab6.Annotation.Task6.ExampleService;
import lab6.AnnotationProcessing.B2;
import lab6.AnnotationProcessing.Entity2;
import lab6.AnnotationProcessing.ToString2;
import lab6.Reflection.B;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("\nВыберите задание:");
        System.out.println("1. К строке");
        System.out.println("2. Аннотация Invoke");
        System.out.println("3. Аннотация Default");
        System.out.println("4. Аннотация ToString");
        System.out.println("5. Аннотация Validate");
        System.out.println("6. Аннотация Two");
        System.out.println("7. Аннотация Cache");
        System.out.println("8. Обработка Аннотации ToString ");

        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                B b = new B();
                System.out.println(b); // Вывод: B(text-B, hello-hello, x-42)
                break;
            case 2:
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
                break;
            case 3:
                // Получаем класс ExampleClass
                Class<ExampleClass> exampleClass = ExampleClass.class;

                // Проверяем аннотацию на классе
                if (exampleClass.isAnnotationPresent(Default.class)) {
                    Default defaultAnnotation = exampleClass.getAnnotation(Default.class);
                    System.out.println("Класс ExampleClass аннотирован @Default с value: " + defaultAnnotation.value().getName());
                }

                // Проверяем аннотацию на поле
                try {
                    Default fieldAnnotation = exampleClass.getDeclaredField("number").getAnnotation(Default.class);
                    if (fieldAnnotation != null) {
                        System.out.println("Поле number аннотировано @Default с value: " + fieldAnnotation.value().getName());
                    }
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }
                break;
            case 4:
                // Получаем класс Person
                Class<Person> personClass = Person.class;

                // Проверяем аннотацию на классе
                if (personClass.isAnnotationPresent(ToString.class)) {
                    ToString toStringAnnotation = personClass.getAnnotation(ToString.class);
                    System.out.println("Класс Person аннотирован @ToString с value: " + toStringAnnotation.value());
                }

                // Проверяем аннотацию на полях
                for (var field : personClass.getDeclaredFields()) {
                    if (field.isAnnotationPresent(ToString.class)) {
                        ToString fieldAnnotation = field.getAnnotation(ToString.class);
                        System.out.println("Поле " + field.getName() + " аннотировано @ToString с value: " + fieldAnnotation.value());
                    }
                }
                break;
            case 5:
                // Получаем класс User
                Class<User> userClass = User.class;

                // Проверяем аннотацию на классе
                if (userClass.isAnnotationPresent(Validate.class)) {
                    Validate validateAnnotation = userClass.getAnnotation(Validate.class);
                    System.out.print("Класс User аннотирован @Validate с value: ");
                    for (Class<?> clazz : validateAnnotation.value()) {
                        System.out.print(clazz.getName() + " ");
                    }
                }
                break;
            case 6:
                // Получаем класс ExampleClass
                Class<ExampleClass2> exampleClass1 = ExampleClass2.class;

                // Проверяем аннотацию на классе
                if (exampleClass1.isAnnotationPresent(Two.class)) {
                    Two twoAnnotation = exampleClass1.getAnnotation(Two.class);
                    System.out.println("Класс ExampleClass аннотирован @Two с параметрами:");
                    System.out.println("first: " + twoAnnotation.first());
                    System.out.println("second: " + twoAnnotation.second());
                }
                break;
            case 7:
                // Получаем класс ExampleService
                Class<ExampleService> exampleServiceClass = ExampleService.class;

                // Проверяем аннотацию на классе
                if (exampleServiceClass.isAnnotationPresent(Cache.class)) {
                    Cache cacheAnnotation = exampleServiceClass.getAnnotation(Cache.class);
                    System.out.println("Класс ExampleService аннотирован @Cache с параметрами:");
                    System.out.println("value: " + String.join(", ", cacheAnnotation.value()));
                } else {
                    System.out.println("Класс ExampleService не аннотирован @Cache.");
                }
                break;
            case 8:
                B2 b1 = new B2();
                System.out.println(b1); // Вывод: B(text-B, hello-hello, x-42)
                break;
        }

    }
}