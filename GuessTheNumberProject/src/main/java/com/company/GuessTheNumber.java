package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int count = 1;
        int number = 17;
        String userChoice = "y";

            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello!  What is your name?");
            String userName = scanner.nextLine();
            System.out.println("Well, " + userName + ", I am thinking of a number between 1 and 20.");
        while(userChoice == "y"){
            for(int i = 1; count <= 6; i++){
                System.out.println("Take a guess. "  + "Count: " + count);
                int userGuess = scanner.nextInt();

                 if (userGuess > 20 || userGuess < 1) {
                    System.out.println("Your guess must be between 1 and 20");
                    count++;
                } else if(userGuess < number){
                    System.out.println("Your guess is too low");
                    count++;
                } else if (userGuess > number && userGuess <= 20) {

                    System.out.println("Your guess is too high");
                    count++;
                } else if (userGuess == number){
                    System.out.println("Good job, " + userName + "! You guess my number in " + count + " guesses!");
                         count =+ 7;
                }
            }
            System.out.println("Would you like to play again? (y/n)");
            Scanner scanner2 = new Scanner(System.in);
            String playAgain = scanner2.nextLine();

            if(playAgain.equals("y")){
                count = 1;
            } else {
                count =+ 7;
                userChoice = "n";
            }

        }
    }
}
