package com.company;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.Scanner;


class DragonCaveTest {
    int userChoice = 1;
    int userChoice2 = 2;
    @BeforeEach
    void setUp() {
        Scanner scanner = new Scanner(System.in);
    }


    @Test
    void getUserChoice1(){
        assertEquals(1, userChoice);
    }

    @Test
    void getUserChoice2(){
        assertEquals(2, userChoice2);
    }


    @AfterEach
    void tearDown() {
    }



}