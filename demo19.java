import java.util.Scanner;

public class Demo19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        long rounded = Math.round(number);
        System.out.println("Rounded figure: " + rounded);
    }
}