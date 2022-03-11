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

    static File start = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Start.text");
    static File strike1 = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Strike1.text");
    static File strike2 = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Strike2.text");
    static File strike3 = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Strike3.text");
    static File strike4 = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Strike4.text");
    static File strike5 = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Strike5.text");
    static File strike6 = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Strike6.text");
    static File strike7 = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Strike7.text");
    static Scanner scanner = new Scanner(System.in);
    static int lives = 7;
    static ArrayList<Character> usedLetters = new ArrayList<Character>();
    static boolean gameOver = false;
    static boolean gameWon = false;
    static int score = 0;
    static String playerName = "";

    public static String generateWord() {
        String[] wordList = {"cat", "dog", "horse", "steal", "bite", "hotel", "pocket", "highland", "pig"};
        Random rand = new Random();
        String correctWord = wordList[rand.nextInt(wordList.length)];
        return correctWord;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("\n \n \n ");
        System.out.println("****** Welcome to Hangman ******" + "\n" +
                "What is your name? ");
        playerName = scanner.nextLine();
        System.out.println("============  HI " + playerName.toUpperCase() + "!  ============" + "\n");

        String correctWord = generateWord();
        char[] letters = new char[correctWord.length()];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = '_';
        }

//        while(gameOver == false){
        while(lives > 0){
            if(lives == 7){
                char[] array = new char[42];
                FileReader input = new FileReader(start);
                input.read(array);
                System.out.println(array);
                System.out.println("Missed letters:" + "\n" + Arrays.toString(letters));

            } else if(lives == 6){
                char[] array = new char[42];
                FileReader input = new FileReader(strike1);
                input.read(array);
                System.out.println(array);
                System.out.println("Missed letters:" + "\n" + Arrays.toString(letters));
            } else if(lives == 5){
                char[] array = new char[42];
                FileReader input = new FileReader(strike2);
                input.read(array);
                System.out.println(array);
                System.out.println("Missed letters:" + "\n" + Arrays.toString(letters));
            }  else if(lives == 4){
                char[] array = new char[42];
                FileReader input = new FileReader(strike3);
                input.read(array);
                System.out.println(array);
                System.out.println("Missed letters:" + "\n" + Arrays.toString(letters));
            }  else if(lives == 3){
                char[] array = new char[42];
                FileReader input = new FileReader(strike4);
                input.read(array);
                System.out.println(array);
                System.out.println("Missed letters:" + "\n" + Arrays.toString(letters));
            }  else if(lives == 2){
                char[] array = new char[42];
                FileReader input = new FileReader(strike5);
                input.read(array);
                System.out.println(array);
                System.out.println("Missed letters:" + "\n" + Arrays.toString(letters));
            }  else if(lives == 1){
                char[] array = new char[42];
                FileReader input = new FileReader(strike6);
                input.read(array);
                System.out.println(array);
                System.out.println("Missed letters:" + "\n" + Arrays.toString(letters));
            }

            System.out.println("\nGuess a letter, " + playerName + ".");
            String guess = scanner.nextLine();
            char letter = guess.charAt(0);


            boolean correctGuess = false;


//       ************* Update with map, filter, or reduce *******************

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


//       ************* Update with map, filter, or reduce *******************

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
                score += 1;
                // here's where you'll write to the file to record scores

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
//       ************* Update with map, filter, or reduce *******************

                    for (int i = 0; i < letters.length; i++) {
                        letters[i] = '_';
                    }
                    //****************************************************************
                }


            } else if (lives == 0){
                char[] array = new char[42];
                FileReader input = new FileReader(strike7);
                input.read(array);
                System.out.println(array);
                System.out.println("Missed letters:" + "\n" + Arrays.toString(letters));
                System.out.println("\n ");
                System.out.println("\uD83D\uDE2C You lost.  The word was: " + correctWord);
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

//       ************* Update with map, filter, or reduce *******************

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
