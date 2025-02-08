package Core_Java;

import java.util.*;

class login{
    public static void main(String[] args) {
        boolean a = true;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter username: ");
            String id = sc.next();
            System.out.print("Enter password: ");
            String pass = sc.next();
            if((id.equals("user001")) && (pass.equals("user_001"))){
                System.out.println("Happy new year");
                break;
            }else{
                System.out.println("credentials does not match. Please try again.");
            }
        }
    }
}