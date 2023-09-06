import java.lang.reflect.Field;

class MyClass {
    private int privateField;
    public String publicField;
    protected double protectedField;

    public MyClass(int privateField, String publicField, double protectedField) {
        this.privateField = privateField;
        this.publicField = publicField;
        this.protectedField = protectedField;
    }

    public void printFields() {
        System.out.println("privateField: " + privateField);
        System.out.println("publicField: " + publicField);
        System.out.println("protectedField: " + protectedField);
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        MyClass myObject = new MyClass(42, "Hello, Reflection!", 3.14);

        // Accessing publicField using reflection
        Field publicField = myObject.getClass().getField("publicField");
        String fieldValue = (String) publicField.get(myObject);
        System.out.println("Accessing publicField using reflection: " + fieldValue);

        // Modifying privateField using reflection
        Field privateField = myObject.getClass().getDeclaredField("privateField");
        privateField.setAccessible(true); // Allow access to private field
        privateField.setInt(myObject, 123);

        // Printing the fields using the printFields method
        System.out.println("Modifying privateField using reflection:");
        myObject.printFields();
    }
}
