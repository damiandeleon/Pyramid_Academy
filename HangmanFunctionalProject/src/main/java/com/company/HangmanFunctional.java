package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;

public class HangmanFunctional {
    public static String generateWord() {
        String[] wordList = {"cat", "dog", "horse", "steal", "bite", "hotel", "pocket", "highland", "pig"};
        Random rand = new Random();
        String correctWord = wordList[rand.nextInt(wordList.length)];
        return correctWord;
    }
    static File start = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Start.text");
    static File strike1 = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Strike1.text");
    static File strike2 = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Strike2.text");
    static File strike3 = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Strike3.text");
    static File strike4 = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Strike4.text");


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int lives = 4;
        ArrayList<Character> usedLetters = new ArrayList<Character>();
        boolean gameOver = false;
        boolean gameWon = false;

        String correctWord = generateWord();
        char[] letters = new char[correctWord.length()];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = '_';
        }

//        while(gameOver == false){
        while(lives > 0){
            if(lives == 4){
                char[] array = new char[42];
                FileReader input = new FileReader(start);
                input.read(array);
                System.out.println(array);
                System.out.println("Missed letters:" + "\n" + Arrays.toString(letters));

            } else if(lives == 3){
                char[] array = new char[42];
                FileReader input = new FileReader(strike1);
                input.read(array);
                System.out.println(array);
                System.out.println("Missed letters:" + "\n" + Arrays.toString(letters));
            } else if(lives == 2){
                char[] array = new char[42];
                FileReader input = new FileReader(strike2);
                input.read(array);
                System.out.println(array);
                System.out.println("Missed letters:" + "\n" + Arrays.toString(letters));
            }  else if(lives == 1){
                char[] array = new char[42];
                FileReader input = new FileReader(strike3);
                input.read(array);
                System.out.println(array);
                System.out.println("Missed letters:" + "\n" + Arrays.toString(letters));
            }

            System.out.println("Guess a letter.");
            String guess = scanner.nextLine();
            char letter = guess.charAt(0);


            boolean correctGuess = false;

            for(int i = 0; i < correctWord.length(); i++){
                char character = correctWord.charAt(i);


                if(character == letter){
                    letters[i] = character;
                    correctGuess = true;
                }

            }
            if (usedLetters.contains(letter)){
                System.out.println("You already guessed that letter.  Try again");
            }
            if (!correctGuess){
                lives = lives -1;
            }



            for (int i = 0; i < letters.length; i++) {
                if(letters[i] == '_'){
                    gameOver = false;
                }
                if (letters[i] != '_'){
                    gameOver = true;
                }
            }
            usedLetters.add(letter);
            System.out.println("-----------------------------");



            if (gameOver){
                System.out.println("Yes!  The secret word is: " + correctWord + ". You have won!");

                System.out.println("Do you want to play again? (y/n)");
                String playAgain = scanner.nextLine();

                if(playAgain.equals("n")){
                    gameOver  = true;
                    lives = 0;
                    break;
                } else {
                    gameOver = false;
                    usedLetters.clear();
                    lives = 4;
//**************************************************************
//                    rand = new Random();
//                    correctWord = wordList[rand.nextInt(10)];
                    correctWord = generateWord();
                    letters = new char[correctWord.length()];
                    for (int i = 0; i < letters.length; i++) {
                        letters[i] = '_';
                    }
                    //****************************************************************
                }


            } else if (lives == 0){
                System.out.println("You lost.  The word was: " + correctWord);
                System.out.println("Do you want to play again? (y/n)");
                String playAgain = scanner.nextLine();

                if(playAgain.equals("n")){
                    gameOver  = true;
                    lives = 0;

                } else {
                    gameOver = false;
                    usedLetters.clear();
                    lives = 4;
//**************************************************************
//                    rand = new Random();
//                    correctWord = wordList[rand.nextInt(10)];
                    correctWord = generateWord();
                    letters = new char[correctWord.length()];
                    for (int i = 0; i < letters.length; i++) {
                        letters[i] = '_';
                    }
                    //****************************************************************
                }

            }

        }




        System.out.println("Exiting Game");
    }

}
