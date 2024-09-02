package AnnotationsJava;
import java.lang.annotation.ElementType;

import java.lang.annotation.Retention;

import java.lang.annotation.RetentionPolicy;

import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  // Annotation is available at runtime

@Target({ElementType.TYPE, ElementType.METHOD})  // Can be used on classes and methods

public @interface Author {

    String name();

    String date();

}

