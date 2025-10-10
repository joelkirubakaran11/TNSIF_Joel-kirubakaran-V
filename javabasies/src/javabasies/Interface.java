interface Animal {
    void sound(); // abstract method
}

class Dog implements Animal {
    public void sound() { 
        System.out.println("Dog barks");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();
    }
}
