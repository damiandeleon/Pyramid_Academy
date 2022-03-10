package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HangmanFunctionalTest {
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

    @BeforeEach
    void setUp() {
        System.out.println("********** beginning test **********");
    }

    @Test
    void generateWord() {

        HangmanFunctional game = new HangmanFunctional();
        String result = game.generateWord();
        if(wordList.contains(result)){
            System.out.println("Pass");
        } else System.out.println("fail");
    }
    @AfterEach
    void tearDown() {
        System.out.println("*********** ending test ************");
    }

}