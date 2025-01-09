public class Demo21 {
    public static void main(String[] args) {
        // Loop through numbers 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Demo21");
            }
            // Check if divisible by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check if divisible by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Otherwise, print the number
            else {
                System.out.println(i);
            }
        }
    }
}