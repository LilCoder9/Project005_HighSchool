
/**
 * Class Quadratic1
 * 
 * @author (your name) 
 */

import java.util.*;

public class Quadratic1
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        double a, b, c;     // coefficients
        double discr;       // discriminant
        double x1, x2;      // solutions
        
        System.out.println("Quadratic equation solver:  a*x^2 + b*x + c = 0");
        System.out.print("A=? ");
        a = console.nextDouble();
        System.out.print("B=? ");
        b = console.nextDouble();
        System.out.print("C=? ");
        c = console.nextDouble();
        
        discr = Math.pow(b,2) - (4*a*c);
        
        System.out.printf("The discriminant is %.2f \n",discr);
        
        if(discr == 0)
        {
            x1 = -b / (2 * a);
            System.out.printf("The equation has 1 real solution, x = %.2f", x1);
        }
        else if(discr < 0)
        {
            System.out.println("The equation has NO real solutions!");
        }
        else
        {
            x1 = (-b + Math.sqrt(discr))/(2*a);
            x2 = (-b - Math.sqrt(discr))/(2*a);
            System.out.printf("The equation has 2 real solutions, x = %.2f and x = %.2f", x1, x2);
        }
        
            
        
        
        
    }
}