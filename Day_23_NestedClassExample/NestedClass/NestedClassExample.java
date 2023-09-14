package Day_23_NestedClassExample.NestedClass;

// Outer class
class Outer {
    private int outerField = 10;

    // Static nested class
    static class StaticNested {
        void display() {
            System.out.println("StaticNested class");
        }
    }

    // Inner class
    class Inner {
        void display() {
            System.out.println("Inner class: " + outerField);
        }
    }

    // Method with a local inner class
    void outerMethod() {
        class LocalInner {
            void display() {
                System.out.println("LocalInner class");
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.display();
    }

    // Anonymous inner class (implementing Runnable)
    Runnable anonymousInner = new Runnable() {
        @Override
        public void run() {
            System.out.println("Anonymous inner class (Runnable)");
        }
    };
}

public class NestedClassExample {
    public static void main(String[] args) {
        // Static nested class
        Outer.StaticNested staticNested = new Outer.StaticNested();
        staticNested.display();

        // Inner class
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();

        // Local inner class
        outer.outerMethod();

        // Anonymous inner class (Runnable)
        Runnable runnable = outer.anonymousInner;
        runnable.run();
    }
}

