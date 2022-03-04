package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MapTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addEntity() {
        Map map = new Map(2);
        ArrayList<Map.Row> gameboard = new ArrayList<>();
        ArrayList<Humanoid> entities = new ArrayList<>();
        ArrayList<Terrain> terrains = new ArrayList<>();
        Humanoid gob = new Humanoid(1,1);
        Humanoid man = new Humanoid(2,1);
        entities.add(gob);
        entities.add(man);
        assertEquals(0, entities.indexOf(gob));
        assertEquals(1,entities.indexOf(man));
    }

    @Test
    public void addTerrain() {
    }
}