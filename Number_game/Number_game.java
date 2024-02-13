

 /**
  * Number_game
  */

import java.util.*;
public class Number_game 
 {
    public static int getrandN(int min, int max)
    {
       return (int)(Math.random()*(max-min+1)+min); 
    }


    public static void main(String[] args) 
    {
        int chance = 10;
        int finals =0;
        boolean play_again =true;

        System.out.println( "!!!!   welcome to the Game you have " + chance + " for win to the game  !!!");

        while (play_again)
        {
            int rand = getrandN(1,100);
            boolean guess = false;

            for(int i=0; i<chance;i++)
            {
                System.out.println();
                System.out.print( "Chance " +(i+1) +" Enter your number of guess :");
                Scanner input = new Scanner(System.in);
                int user  = input.nextInt(); 

                finals =finals+1;

                if ( user == rand )
                {
                    guess = true;
                    System.out.println( "Execution time is :" + ( finals) );
                    break;
                }

                else if ( user > rand)
                {
                    System.out.println( "Too High");
                }

                else 
                {
                    System.out.println( "Too Low");
                }
            }
            
            if(guess==false)
            {

                System.out.println( "Sorry you Lost the chance the number is " + rand); 
                System.out.println();
            }

            System.out.println();
            System.out.println( "****************"); 
            System.out.println( "* Y ------ Yes *");
            System.out.println( "* Y ------ N0  *");
            System.out.println( "****************");
            System.out.print( "Do you want the play againg (Y/N) : " );
            Scanner input1 = new Scanner(System.in);
            String choice = input1.next();
            play_again = choice.equals("Y");


    
        }
         
        
    }

   
 
    
 }
