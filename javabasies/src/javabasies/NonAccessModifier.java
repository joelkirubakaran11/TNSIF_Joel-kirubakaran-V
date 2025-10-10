abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    final int wheels = 4; 

    static String brand = "Tesla"; 

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Wheels: " + wheels);
    }

    void start() {
        System.out.println("Car starts with a button!");
    }
}

public class NonAccessModifier {
    public static void main(String[] args) {
        Car c = new Car();
        c.show();
        c.start();
    }
}
