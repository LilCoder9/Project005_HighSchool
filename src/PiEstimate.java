

/**
 * Class Loan
 * 
 * @author (your name) 
 */

import java.util.*;
public class PiEstimate
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        double x;
        double y;
        int trials;
        double distance;
        int hit=0;
        int miss=0;
        double pi;
       
        System.out.println("Welcome to the Pi Estimation Program.");
        System.out.print("How many trials would you like to run?");
        trials = console.nextInt();
        
        for(int number = 0 ; number < trials; number++)
        {
        x=2*Math.random();
        y=2*Math.random();
        
        distance = Math.sqrt(Math.pow(x-1,2)+Math.pow(y-1,2));
        
        if(distance < 1)
        {
            hit = hit + 1;
        }
        else
        {
            miss = miss + 1;
        }
    }
    pi = (double)hit / miss;
    System.out.printf("Pi is estimated to be %f", pi);
        

    
    }
}



