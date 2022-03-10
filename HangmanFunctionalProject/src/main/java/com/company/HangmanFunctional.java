package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HangmanFunctional {
    public static String generateWord() {
        String[] wordList = {"cat", "dog", "horse", "steal", "bite", "hotel", "pocket", "highland", "pig"};
        Random rand = new Random();
        String correctWord = wordList[rand.nextInt(wordList.length)];
        return correctWord;
    }



    public static void main(String[] args) {

    }
}
