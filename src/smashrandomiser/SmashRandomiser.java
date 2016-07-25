
package smashrandomiser;

import java.util.Scanner;

public class SmashRandomiser {
private String input;
private int numInput;
private String output ="";


    public static void main(String[] args) {
       
        SmashRandomiser sr = new SmashRandomiser();
        
    }
    public SmashRandomiser()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter T for Teams or S for Singles");
        input = scan.nextLine();
        if (input.equalsIgnoreCase("S"))
        {
            System.out.println("How many charcaters do you want ?");
            input = scan.nextLine();
            SinglesRandom sr = new SinglesRandom();
            sr.getRanChars(Integer.parseInt(input));
            System.out.println("The characters are \n");
            for(int i = 0;i<Integer.parseInt(input);i++)
            {
                output+= sr.getSelected(i)+"\n";
            }
            System.out.println(output);
            
            
            
        }
        else if(input.equalsIgnoreCase("T"))
        {
            System.out.println("How many teams do you want ?");
            input = scan.nextLine();
            DoublesRandom dr = new DoublesRandom();
            dr.getRanChars(Integer.parseInt(input));
            System.out.println("The teams are \n");
            for(int i = 0;i<Integer.parseInt(input);i++)
            {
                output+= dr.getSelected(i)+"\n";
            }
            System.out.println(output);
        }
        else
        {
            System.out.println("Not a Valid option");
        }
        }

   
    }

}
