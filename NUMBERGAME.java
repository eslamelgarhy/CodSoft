/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package number.game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Eslam
 */
public class NUMBERGAME {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int score = 0;
        // Create a Random object
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
       
        
       boolean playAgain = true;
       while(playAgain){
       
        // Generate a random number within the range
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Print the random number
        System.out.println("Random number between " + min + " and " + max + ": " );
       
      
        for(int i=4 ;i>=0 ; i-- ){
            System.out.print("enter your guess for the random number: ");
            int get_guess = scan.nextInt();
            
            if(get_guess == randomNumber)
                {System.out.println("Congratulations! You guessed the correct number."+randomNumber);
                    score += i + 1;
                 break ;}
            else if(randomNumber < get_guess)
                {System.out.println("your guess is too high");}
            else if(randomNumber > get_guess)
                {System.out.println("your guess is too low");}
            System.out.println("You have "+i+" attempts");
            if(i==0) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);}
            
       }
        System.out.print("Do you want to play again? (yes/no): ");
            String playAgainChoice = scan.next().toLowerCase();
            if (!playAgainChoice.equals("yes")) {
                playAgain = false;
    }
    
            
       }  
        System.out.println("Your total score: " + score);
        System.out.println("Thank you for playing!");
        scan.close();
}}
