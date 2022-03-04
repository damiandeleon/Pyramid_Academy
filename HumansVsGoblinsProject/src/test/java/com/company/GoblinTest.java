package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoblinTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldMoveGoblinXCoordToDynamicllyMoveCloserToHuman() {
        Map map = new Map(5);
        Human man = new Human(1,3);
        Goblin gob = new Goblin(2,2);

        gob.moveGoblin(2,2,1,3);

        assertEquals(1,gob.x);

    }

    @Test
    public void shouldMoveGoblinYCoordToDynamicllyMoveCloserToHuman() {
        Map map = new Map(5);
        Human man = new Human(1,3);
        Goblin gob = new Goblin(2,2);

        gob.moveGoblin(2,2,1,3);

        assertEquals(3,gob.y);

    }
}