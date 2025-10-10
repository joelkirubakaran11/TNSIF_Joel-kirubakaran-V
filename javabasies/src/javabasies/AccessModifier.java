class AccessExample {
    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40; 

    public void display() {
        System.out.println("Inside same class:");
        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
    }
}

public class AccessModifierDemo {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();
        obj.display();
        System.out.println("Accessing public variable: " + obj.publicVar);
        
    }
}
