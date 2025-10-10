public class Wrapper {
    public static void main(String[] args) {
        int a = 20;                  
        Integer obj = Integer.valueOf(a); 
        int b = obj;                

        System.out.println("Primitive: " + a);
        System.out.println("Object (Wrapper): " + obj);
        System.out.println("Unboxed: " + b);
    }
}
