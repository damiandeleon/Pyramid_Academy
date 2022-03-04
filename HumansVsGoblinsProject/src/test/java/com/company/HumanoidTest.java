package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.*;

public class HumanoidTest {


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldMoveNorthByDecreasingXBy1() {
        Map map = new Map(5);
        Humanoid man = new Human(3,0);
        man.moveNorth();
        assertEquals(2,man.x);

    }

    @Test
    public void shouldMoveSouthByIncreasingXBy1() {
        Map map = new Map(5);
        Humanoid gob = new Goblin(2,2);
        gob.moveSouth();
        assertEquals(3,gob.x);
    }

    @Test
    public void shouldMoveEastByIncreasingYBy1() {
        Map map = new Map(5);
        Humanoid man = new Human(3,0);
        man.moveEast();
        assertEquals(1,man.y);
    }

    @Test
    public void shouldMoveWestByDecreasingYBy1() {
        Map map = new Map(5);
        Humanoid gob = new Goblin(2,2);
        gob.moveWest();
        assertEquals(1,gob.y);
    }
}