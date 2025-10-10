public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[5] = 50 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds!");
        } catch (Exception e) {
            System.out.println("Some other exception occurred!");
        }
        System.out.println("Program ended.");
    }
}
