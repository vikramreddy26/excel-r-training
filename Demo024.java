import java.util.ArrayList;

public class Demo024 {
    public static void printDetails(String name, int age, String address) {
        ArrayList<Object> details = new ArrayList<>();
        details.add(name);
        details.add(age);
        details.add(address);

        for (Object detail : details) {
            System.out.println(detail);
        }
    }

    public static void main(String[] args) {
        printDetails("A", 19, "Here");
        printDetails("B", 20, "There");
        printDetails("C", 19, "Where");
    }
}
