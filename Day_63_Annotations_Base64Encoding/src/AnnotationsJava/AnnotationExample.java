package AnnotationsJava;

import java.lang.reflect.Method;

public class AnnotationExample {

    public static void main(String[] args) {

        // Check if the class has the @Author annotation

        if (MyClass.class.isAnnotationPresent(Author.class)) {

            Author author = MyClass.class.getAnnotation(Author.class);

            System.out.println("Class Author: " + author.name() + ", Date: " + author.date());

        }

        // Check if the method has the @Author annotation

        try {

            Method method = MyClass.class.getMethod("myMethod");

            if (method.isAnnotationPresent(Author.class)) {

                Author author = method.getAnnotation(Author.class);

                System.out.println("Method Author: " + author.name() + ", Date: " + author.date());

            }

        } catch (NoSuchMethodException e) {

            e.printStackTrace();

        }

    }

}