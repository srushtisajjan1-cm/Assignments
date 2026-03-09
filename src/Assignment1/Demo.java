package Assignment1;

class Demo {

    void show(int a) { // Overloading
        System.out.println("Method with 1 param");
    }

    void show(int a, int b) { // Overloading
        System.out.println("Method with 2 params");
    }
}

class Test extends Demo {

    void show(int a) { // Overriding
        System.out.println("Overridden Method");
    }

    public static void main(String[] args) {
        Test t = new Test();

        t.show(10);       // Overriding
        t.show(10,20);    // Overloading
    }
}