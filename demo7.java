import java.util.Scanner;

public class demo7

{
    public static void main(String[] args) {
        String name;
        int age;
        Long phoneNo;
        System.out.println("Please enter your name, age, phoneNo");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        age = scanner.nextInt();
        phoneNo = scanner.nextLong();
        System.out
                .println("Hello" + " " + name + " " + "ur age is" + " " + age + " " + "ur phoneNo is" + " " + phoneNo);

    }
}