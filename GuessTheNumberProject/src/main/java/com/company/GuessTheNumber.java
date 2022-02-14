package com.company;


import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int count = 1;
        int number = 17;
        String userChoice = "y";


            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello!  What is your name?");
            String userName = scanner.nextLine();
            try{
                System.out.println("Well, " + userName + ", I am thinking of a number between 1 and 20.");
            } catch(Exception e){
                System.out.println(e.getMessage());
            }

        while(userChoice.equals("y")){
            try{
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
                userChoice = scanner2.nextLine();
                try{
                    if(userChoice.equals("y")){
                        count = 1;
                    } else if(userChoice.equals("n")){
                        count =+ 7;
//                        userChoice = "n";
                        System.out.println("Thanks for playing " + userName + "!");
                    }
                } catch(Exception e){
                    System.out.println("Please answer with 'y' or 'no'.");
                }

            } catch (Exception e){
                System.out.println(e.getMessage() + " Response must be a numerical number between 1 and 20");
                break;
            }


        }
    }
}
