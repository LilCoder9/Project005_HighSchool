
/**
 * Class Loan
 * 
 * @author (your name) 
 */
import java.util.*;

public class Loan
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        double amount;  // loan amount
        double r;       // annual interest rate
        int    y;       // term of loan in years
        int    n;       // number of payments
        double i;       //monthly interst
        double totalInterest;
        double totalPayback;
        double monthlyPayment;
        double partInt;
        double partPRIN;
        
        System.out.println("Duluth High School's Loan Calculator\n\n");
            
        System.out.print("What is the loan amount (in dollars)? ");
        amount = console.nextDouble();
        
        System.out.print("What is the annual interest rate (in percent)? ");
        r = console.nextDouble();
        
        System.out.print("What is the term of the loan (in years)? ");
        y = console.nextInt();
        
        //Math
        n = y * 12;
        i = r / 1200;
        monthlyPayment = (amount*i)/(1-(Math.pow(1+i,-n)));
        totalPayback = monthlyPayment * n;
        totalInterest = totalPayback - amount;
        
        System.out.println("\nPART 1 - Loan Information");
        
        System.out.printf(" \nYou will make %d payments.\n", n);
        System.out.printf("Your monthly payment will be $%.2f \n", monthlyPayment);
        System.out.printf("Your total payback will be $%.2f \n", totalPayback);
        System.out.printf("The total interest is $%.2f \n",totalInterest);
        
        System.out.println("\n PART 2 - Loan amortization: \n");
        
        System.out.println("#   BALANCE   PAYMENT   Part INT    Part PRIN");
         for(int number = 1; number <= n +1; number++)
         {
             partInt = amount * r/1200;
             amount = partInt + amount;
             partPRIN = monthlyPayment - partInt;
             System.out.printf("%d  %.2f    %.2f    %.2f    %.2f \n", number, amount, monthlyPayment, partInt, partPRIN);
             amount = amount - monthlyPayment;
            }
             
        
        

    
    }
}
