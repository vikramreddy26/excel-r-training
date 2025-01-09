import java.util.Scanner;

public class Demo22 {
    
    public static void main(String[] args) {
        
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Taking monthly gross salary, HRA, and PF as inputs
        System.out.print("Enter monthly gross salary (in Rs): ");
        double grossSalary = sc.nextDouble();
        
        System.out.print("Enter monthly HRA (in Rs): ");
        double hra = sc.nextDouble();
        
        System.out.print("Enter monthly PF (in Rs): ");
        double pf = sc.nextDouble();
        
        // Calculate annual salary, deductions, and taxable income
        double annualSalary = grossSalary * 12;
        double deductions = (hra + pf) * 12; // Deductions are annual, so multiplied by 12
        double taxableIncome = annualSalary - deductions;
        
        // Variable to store total tax
        double totalTax = 0;
        
        // Tax Calculation based on slabs
        if (taxableIncome <= 500000) {
            totalTax = taxableIncome * 0.10; // 10% tax
        } else if (taxableIncome <= 1000000) {
            totalTax = 50000 + (taxableIncome - 500000) * 0.20; // 20% tax on amount exceeding 500000
        } else {
            totalTax = 150000 + (taxableIncome - 1000000) * 0.30; // 30% tax on amount exceeding 1000000
        }
        
        // Display results
        System.out.println("Annual Salary: Rs " + annualSalary);
        System.out.println("Annual Deductions (HRA + PF): Rs " + deductions);
        System.out.println("Taxable Income: Rs " + taxableIncome);
        System.out.println("Total Tax to be paid: Rs " + totalTax);
        
        // Close scanner
        sc.close();
    }
}