package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberTest {
    int rightAnswer = 17;

    @BeforeEach
    void setUp() {
        Scanner scanner = new Scanner(System.in);
    }

    @Test
    void main() {
        assertEquals(17, rightAnswer);
    }

    @AfterEach
    void tearDown() {
    }
}