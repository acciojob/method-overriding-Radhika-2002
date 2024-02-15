package com.driver;

public class Main {
    static class A {
        // Task 1: Method in class A
        public String meth() {
            return "Invoking method from class A";
        }
    }

    static class B extends A {
        // Task 4: Overriding method in class B
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        B objB = new B();

        // Task 3: Call method from class A using object of class B
        System.out.println(objB.meth()); // Output: Method is overridden in Extended class B
    }
}
