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
        ArrayList<Humanoid> entities = new ArrayList<>();

        Humanoid gob = new Humanoid(1,1);
        Humanoid man = new Humanoid(2,1);
        entities.add(gob);
        entities.add(man);
        assertEquals(0, entities.indexOf(gob));
        assertEquals(1,entities.indexOf(man));
    }

    @Test
    public void addTerrain() {
        Map map = new Map(2);
        ArrayList<Terrain> terrains = new ArrayList<>();

        Terrain land = new Terrain(0,0);
        Terrain land2 = new Terrain(2,1);
        terrains.add(land);
        terrains.add(land2);
        assertEquals(0,terrains.indexOf(land));
        assertEquals(1, terrains.indexOf(land2));

    }
}