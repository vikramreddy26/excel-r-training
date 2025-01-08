import java.util.Scanner;

public class demo2 {

    public static int greatestOfTwo(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int result = greatestOfTwo(num1, num2);

        System.out.println("The greatest of the two numbers is: " + result);
        scanner.close();
    }
}