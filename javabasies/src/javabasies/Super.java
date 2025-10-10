class Parent {
    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void show() {
        super.show(); 
        System.out.println("Child method");
    }
}

public class Super {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
