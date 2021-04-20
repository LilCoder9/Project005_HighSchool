/**
 * Class Dice
 * 
 * @author (your name) 
 */
import java.util.*;

public class Dice
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int dice;
        int rolls;
        int uno=0;
        int dos=0;
        int tres=0;
        int cuatro=0;
        int cinco=0;
        int seis=0;
        
        System.out.print("How many times should the die be rolled?");
        rolls = console.nextInt();
        
        for(int number = 0; number < rolls; number++)
        {
            dice =(int)(6* Math.random())+1;
            switch(dice){
                case 1: uno = uno + 1;
                        break;
                case 2: dos = dos + 1;
                        break;
                case 3: tres = tres + 1;
                        break;
                case 4: cuatro = cuatro + 1;
                        break;
                case 5: cinco = cinco + 1;
                        break;
                case 6: seis = seis + 1;
                        break;
                    }
                }
        
                System.out.printf("ones:     %d\n", uno);
                System.out.printf("twos:     %d\n", dos);
                System.out.printf("threes:   %d\n", tres);
                System.out.printf("fours:    %d\n", cuatro);
                System.out.printf("fives:    %d\n", cinco);
                System.out.printf("sixes:    %d\n", seis);
    }
}