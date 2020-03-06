/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adventure.game;
import java.util.Scanner;
/**
 *
 * @author jomat9237
 */
public class AdventureGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String decision;
        
        System.out.println("'Hi travaller!' said a small hobbit. 'We need to fight a dagon! answer yes or no'");
        Scanner input = new Scanner (System.in);
        decision = input.nextLine();
        
        if(decision.equals("yes")){
            
            System.out.println("'Thank you, here is the sword of life, it has been passed down through my family for generations but I have no son and should be put to work killing the dragon. Do you accept this gift");
            decision = input.nextLine();
            
            if(decision.equals("no")){
                
                System.out.println("'because you're so humble I bestow this sword upon you, you have passed the test. Do you want me to a company you? ");
                decision = input.nextLine();
                
                if(decision.equals("yes")){
                    
                    System.out.println("'ok lets go!' you both travel all day and night and finally meet the dragon in the cave. The dragon seems to be sleeping. Do you go for a sneak attack or wake up the dragon and try to reason with it? answer 1 or 2");
                    decision = input.nextLine();
                    
                    if(decision.equals("2")){
                        System.out.println("You wake up the dragon and ask it to leave. The dragon responds ' oops my b' and leaves. You won");
                    }
                    else{
                        System.out.println("You walk up to the dragon and try to stab it, it wakes the dragon up and it eats you. You died");
                    }
                }
                else{
                    System.out.println("On your way to the cave you get conered by goblins and die. too bad. You died.");
                }
            }
            else{ 
                System.out.println("'Why would I give you this sword.' The hobbit shanks you and runs away. You died");
            
            }
        }
        else{
            System.out.println("the hobbit shanks you and steals all of your things. You died");
        }

    }
    
}

