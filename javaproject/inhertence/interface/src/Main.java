// Defining an interface A
interface A {
    // Default method in the interface (has a body)
    // Default methods were introduced in Java 8
    default void methodA() {
        System.out.println("Method A");
    }
}

// Defining another interface B
interface B {
    // Abstract method (without implementation)
    void methodB();
}

// Class C implementing both interfaces A and B
class C implements A, B {
    // methodA() is inherited from interface A (since it's a default method)
    // So we don't need to explicitly override it unless we want to modify it

    // Implementing the abstract method from interface B
    public void methodB() {
        System.out.println("Method B");
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        // Creating an object of class C
        C obj = new C();

        // Calling methodA() from interface A (inherited by C)
        obj.methodA(); // Since it's a default method, it gets inherited automatically

        // Calling methodB(), which is implemented in class C
        obj.methodB();
    }
}
