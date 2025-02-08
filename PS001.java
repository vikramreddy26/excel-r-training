package Core_Java;

import java.util.*;

class Employee{
    int id;
    String firstName;
    String lastName;
    String address;
    Employee(){
        this(0, null, null, null);
    }
    Employee(int id, String firstName, String lastName, String address){
        this.id=id;
        this.firstName=firstName;
        this.lastName = lastName;
        this.address=address;
    }
    String getFullName(){
        return firstName+" "+lastName;
    }
}

class PartTimeEmployee extends Employee{
    private double amountPerHour;
    private int hoursWorked;

    PartTimeEmployee(){}

    PartTimeEmployee(double amountPerHour,int hoursWorked){
        this.amountPerHour=amountPerHour;
        this.hoursWorked=hoursWorked;
    }

    double computeSal(){
        return amountPerHour*hoursWorked;
    }

    void showDetails(){ 
        System.out.println("Total Salary: "+computeSal());
    }
}

class FullTimeEmployee extends Employee{
    double basic;
    double bonus;

    FullTimeEmployee(){}

    FullTimeEmployee(double basic, double bonus){
        this.basic=basic;
        this.bonus=bonus;
    }

    double computeSal(){
        return basic+bonus;
    }

    void showDetails(){
        System.out.println("Gross Salary: "+computeSal());
    } 
}


class PS001{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int id = 100;
        String firstName = "Revanth Rao"; 
        String lastName = "Bompelli";
        String address = "Hyderabad";
        Employee emp = new Employee(id, firstName, lastName, address);
        System.out.println("Full name : "+emp.getFullName());
        
        double amountPerHour = 99;
        int hoursWorked = 8;
        PartTimeEmployee obj = new PartTimeEmployee(amountPerHour,hoursWorked);
        System.out.println("\nPart Time Employee:\n"+emp.getFullName());
        obj.showDetails();
        
        double basic=199;
        double bonus=15;
        FullTimeEmployee obj1 = new FullTimeEmployee(basic,bonus);
        System.out.println("\nFull Time Employee:\n"+emp.getFullName());
        obj1.showDetails();

    }
}