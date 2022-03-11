package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HangmanFunctional {

    static File start = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Start.text");
    static File strike1 = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Strike1.text");
    static File strike2 = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Strike2.text");
    static File strike3 = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Strike3.text");
    static File strike4 = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Strike4.text");
    static File strike5 = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Strike5.text");
    static File strike6 = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Strike6.text");
    static File strike7 = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/Strike7.text");
    static File highScores = new File("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/HighScores.text");
    static Scanner scanner = new Scanner(System.in);
    static int lives = 7;
    static ArrayList<Character> usedLetters = new ArrayList<Character>();
    static boolean gameOver = false;
    static boolean gameWon = false;
    static int score = 0;
    static String playerName = "";
    static List<Map<String, Integer>> playerStats = new ArrayList<Map<String, Integer>>();

    public static String generateWord() {
        String[] wordList = {"cat", "dog", "horse", "steal", "bite", "hotel", "pocket", "highland", "pig"};
        Random rand = new Random();
        String correctWord = wordList[rand.nextInt(wordList.length)];
        System.out.println(correctWord);
        return correctWord;
    }

    public static HashMap<String, Integer> addPlayerStats(String name, Integer playerScore) throws IOException {
        FileWriter myWriter = new FileWriter("/Users/damiandeleonschool/GenSpark/Pyramid_Academy/HangmanFunctionalProject/src/main/resources/HighScores.text");
        // new stats are the new HashMap pair for the incoming new stats
        HashMap< String, Integer> newStats = new HashMap< String,Integer> ();
        newStats.put(name, playerScore);

        //add the new player stats to the playerStats List
        playerStats.add(newStats);
        System.out.println(playerStats);

        //Write the newly updated player Stats to the HighScores file
        myWriter.write(String.valueOf(playerStats));
        myWriter.close();


        return newStats;
    }

    public static void printOldScores () throws FileNotFoundException {
        Scanner sc = new Scanner(highScores);
        sc.useDelimiter("\\Z");
        String oldText = sc.next();
        System.out.println("Previous Scores: " + oldText);
    }

    public static void main(String[] args) throws IOException {
        //print out old scores currently in the text file
        printOldScores();
        System.out.println("\n ");

        //request player's name and greet them
        System.out.println("****** Welcome to Hangman ******" + "\n" +
                "What is your name? ");
        playerName = scanner.nextLine();
        System.out.println("============  HI " + playerName.toUpperCase() + "!  ============" + "\n");

        //grab word to start the game by calling the generateWord method
        String correctWord = generateWord();
        char[] letters = new char[correctWord.length()];

// replaced for loop with stream methods to replace each letter with a "_" to hide the letters************
        char[] finalLetters = letters;
        IntStream.range(0, letters.length).forEach(i -> {
            finalLetters[i] = '_';
        });


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
                System.out.println("\uD83D\uDCAF \uD83D\uDCAF \uD83D\uDCAF \uD83D\uDCAF \n Yes!  The secret word is: " + correctWord + ". \n You have won! \n \uD83D\uDCAF \uD83D\uDCAF \uD83D\uDCAF \uD83D\uDCAF");
                score += 1;
                System.out.println(playerName + ", your score is: " + score);
                // here's where you'll write to the file to record scores

                System.out.println("Do you want to play again? (y/n)");
                String playAgain = scanner.nextLine();

                if(playAgain.equals("n")){
                    gameOver  = true;
                    lives = 0;
                    addPlayerStats(playerName, score);
                    break;
                } else if(playAgain.equals("y")){
                    gameOver = false;
                    usedLetters.clear();
                    lives = 7;
                    correctWord = generateWord();
                    letters = new char[correctWord.length()];

//       ************* Update with map, filter, or reduce *******************

                    for (int i = 0; i < letters.length; i++) {
                        letters[i] = '_';
                    }
                    //****************************************************************
                } else {break; }


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
                    lives = 7;
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
//        System.out.println("\n" + "Scores" + "" +
//                "\n" + sc.next());
    }

}
