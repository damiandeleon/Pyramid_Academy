package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HangmanTest {
    ArrayList<String> wordList = new ArrayList<>(){{
        add("cat");
        add("dog");
        add("horse");
        add("steal");
        add("bite");
        add("hotel");
        add("pocket");
        add("highland");
        add("pig");
    }};
    @Before
    public void setUp() throws Exception {
        System.out.println("beginning test");
    }

    @Test
    public void shouldGenerateWord(){
     Hangman game = new Hangman();
        String result = game.generateWord();
        if(wordList.contains(result)){
            System.out.println("Pass");
        } else System.out.println("fail");
    }

    @After
    public void tearDown() throws Exception {
    }
}