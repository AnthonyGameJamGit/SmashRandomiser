
package smashrandomiser;

import java.util.Scanner;

public class SmashRandomiser {
private String[] smashers = new String[56];
private String[] selected;
private int[] previousRands;
private int rand;
private String input;
private String output ="";
private int numSmash;

    public static void main(String[] args) {
       
        SmashRandomiser sr = new SmashRandomiser();
        
    }
    public SmashRandomiser()
    {
        Scanner scan = new Scanner(System.in);
        popArray();
        System.out.println("How Many charcters should be selected");
        numSmash = Integer.parseInt(scan.nextLine());
        previousRands = new int[numSmash];
        selected = new String[numSmash];
        getRandomCharacters(numSmash);
        System.out.println("The Charcter(s) are \n");
        for (int i = 0;i<selected.length;i++)
        {
            output+= selected[i]+"\n";
        }
        System.out.println(output);
   
    }
    private void getRandomCharacters(int amt)
    {
     for (int i =0;i < amt;i++)
     {
         rand = getRandomNum();
         makeUnique();
         previousRands[i] = rand;
         selected[i] = smashers[rand];
     }
    }
    private void makeUnique()
    {
        for (int i = 0;i< previousRands.length;i++)
        {
            if (rand == previousRands[i])
            {
                rand = getRandomNum();
                i =0;
            }
        }
    }
    private int getRandomNum()
    {
         return 0 + (int)(Math.random() * ((55 - 0) + 1));
    }
    private void popArray()
    {
        smashers[0] = "Mario";
        smashers[1] ="Luigi";
        smashers[2] = "Peach";
        smashers[3] = "Bowser";
        smashers[3] = "Yoshi";
        smashers[4] ="Rosilina&Luma";
        smashers[5] ="Boswer.Jr";
        smashers[6] ="Wario";
        smashers[7] ="Donkey Kong";
        smashers[8] ="Diddy Kong";
        smashers[9] ="Mr.Game&Watch";
        smashers[10] ="Little Mac";
        smashers[11] ="Link";
        smashers[12] ="Zelda";
        smashers[13] = "Sheik";
        smashers[14] = "Gannondorf";
        smashers[15] ="Toon Link";
        smashers[16] = "Samus";
        smashers[17] ="Zero Suit Samus";
        smashers[18] ="Pit";
        smashers[19] ="Paulutena";
        smashers[20] ="Marth";
        smashers[21] ="Ike";
        smashers[22] ="Robin";
        smashers[23] ="Duck Hunt Duo";
        smashers[24] ="Kirby";
        smashers[25] ="King DDD";
        smashers[26] ="Meta Knight";
        smashers[27] ="Fox";
        smashers[28] ="Falco";
        smashers[29] ="Pikachu";
        smashers[30] ="Charizard";
        smashers[31] ="Lucario";
        smashers[32] ="Jigglypuff";
        smashers[33] ="Greninja";
        smashers[34] ="R.O.B";
        smashers[35] ="Ness";
        smashers[36] ="Captain Falcon";
        smashers[37] ="Villager";
        smashers[38] ="Olimar";
        smashers[39] ="Wii Fit Trainer";
        smashers[40] ="Shulk";
        smashers[41] ="Dr.Mario";
        smashers[42] ="Dark Pit";
        smashers[43] ="Lucina";
        smashers[44] ="Pac-Man";
        smashers[45] ="Mega Man";
        smashers[46] ="Sonic";
        smashers[47] ="Mewtwo";
        smashers[48] ="Roy";
        smashers[49] ="Ryu";
        smashers[50] ="Cloud";
        smashers[51] ="Corrin";
        smashers[52] ="Bayonetta";
        smashers[53] ="Mii Sword";
        smashers[54] ="Mii Gunner";
        smashers[55] ="Mii Brawler";
               
    }
    
}
