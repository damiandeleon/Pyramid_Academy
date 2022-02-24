package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lives = 3;
        String[] wordList = {"cat", "dog", "bee", "horse", "sea", "steal", "bit", "hot", "patter", "hi"};
        Random rand = new Random();

        String correctWord = wordList[rand.nextInt(10)];

        char[] letters = new char[correctWord.length()];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = '_';
        }

        System.out.println(correctWord);



        while(lives > 0){
            if(lives == 3){
                System.out.println(
                        "HANGMAN" +
                                "\n+---+" +

                                "\n    |" +

                                "\n    |" +

                                "\n    |" +

                                "\n   ===" +
                                "\nMissed letters:" +
                                "\n" + Arrays.toString(letters)

                );
            } else if(lives == 2){
                System.out.println(
                        "HANGMAN" +
                                "\n+---+" +

                                "\n O  |" +

                                "\n    |" +

                                "\n    |" +

                                "\n   ===" +
                                "\nMissed letters:" +
                                "\n" + Arrays.toString(letters)

                );
            } else if(lives == 1){
                System.out.println(
                        "HANGMAN" +
                                "\n+---+" +

                                "\n O  |" +

                                "\n |  |" +

                                "\n    |" +

                                "\n   ===" +
                                "\nMissed letters:" +
                                "\n" + Arrays.toString(letters)
                );
            }  else if(lives == 0){
                System.out.println(
                        "HANGMAN" +
                                "\n+---+" +

                                "\n O  |" +

                                "\n |  |" +

                                "\n |  |" +

                                "\n   ===" +
                                "\nMissed letters:" +
                                "\n" + Arrays.toString(letters)
                );

            }

            System.out.println("Guess a letter.");
            String guess = scanner.nextLine();
            char letter = guess.charAt(0);
            System.out.println("-----------------------------");
            boolean correctGuess = false;

            for(int i = 0; i < correctWord.length(); i++){
                char character = correctWord.charAt(i);
                if(character == letter){
                    letters[i] = character;
                    correctGuess = true;
                }


            }
            if (!correctGuess){
                    lives = lives -1;
                }

        }
        System.out.println("Exiting Game");
    }
}
