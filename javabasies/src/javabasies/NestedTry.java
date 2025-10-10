public class NestedTry {
    public static void main(String[] args) {
        try {
            try {
                int a = 20 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner try-catch: Division by zero!");
            }
            int[] arr = new int[2];
            arr[5] = 20; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer try-catch: Array index error!");
        }
        System.out.println("Program continues normally.");
    }
}
