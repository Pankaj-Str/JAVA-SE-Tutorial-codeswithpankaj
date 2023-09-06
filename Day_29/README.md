# Reflection in Java

Reflection in Java is a mechanism that allows you to inspect and manipulate the structure and behavior of classes, interfaces, fields, methods, and other program entities at runtime. It provides the ability to examine and modify classes and objects during program execution. Reflection is particularly useful for tasks like creating objects dynamically, inspecting classes for metadata, and invoking methods dynamically.

Here are some common use cases and examples of Java reflection:

1. **Getting Class Information:**
   You can use reflection to get information about a class, such as its name, superclass, implemented interfaces, constructors, fields, and methods.

   ```java
   Class<?> myClass = MyObject.class;
   System.out.println("Class Name: " + myClass.getName());
   ```

2. **Creating Instances Dynamically:**
   Reflection allows you to create objects of classes dynamically, even if you don't know the class name at compile time.

   ```java
   Class<?> myClass = Class.forName("com.example.MyClass");
   Object instance = myClass.newInstance();
   ```

3. **Accessing and Modifying Fields:**
   You can read and modify the fields of a class using reflection.

   ```java
   Field field = myClass.getDeclaredField("fieldName");
   field.setAccessible(true);
   Object value = field.get(instance);
   field.set(instance, newValue);
   ```

4. **Invoking Methods Dynamically:**
   Reflection allows you to invoke methods on objects dynamically, which can be useful for creating generic frameworks.

   ```java
   Method method = myClass.getDeclaredMethod("methodName", parameterTypes);
   Object result = method.invoke(instance, args);
   ```

5. **Working with Annotations:**
   Reflection can be used to inspect annotations on classes, methods, or fields.

   ```java
   MyAnnotation annotation = myClass.getAnnotation(MyAnnotation.class);
   ```

6. **Inspecting Enum Constants:**
   You can use reflection to iterate over enum constants.

   ```java
   Class<EnumType> enumClass = EnumType.class;
   EnumType[] enumConstants = enumClass.getEnumConstants();
   ```

7. **Dynamic Proxy Creation:**
   Java reflection can be used in combination with dynamic proxies to create proxy objects that intercept method invocations.

   ```java
   MyInvocationHandler handler = new MyInvocationHandler();
   MyInterface proxy = (MyInterface) Proxy.newProxyInstance(
       MyInterface.class.getClassLoader(),
       new Class<?>[] { MyInterface.class },
       handler
   );
   ```

It's important to note that reflection can have performance overhead and can make code less readable and maintainable. Therefore, it should be used judiciously and only when necessary, such as in cases where you need to interact with unknown or dynamically loaded classes.

