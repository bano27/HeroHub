package HeroJavaClasses;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquadHeroesTest {

    @Test public void testGetsNameOfNewHeroSquad(){
        SquadHeroes newSquad = SquadHeroes.newHeroSquad();
        assertEquals("Marvel",newSquad.getSquadName());
    }

    @Test public void testGetsMissionControlOfNewHeroSquad(){
        SquadHeroes newSquad = SquadHeroes.newHeroSquad();
        assertEquals("Protect Earth",newSquad.getMissionControl());
    }

    @Test public void testGetsSquadSizeOfNewHeroSquad(){
        SquadHeroes newSquad = SquadHeroes.newHeroSquad();
        assertEquals(22,newSquad.getSquadSize());
    }

    @Test public void testGetsSquadIdOfNewHeroSquad(){
        SquadHeroes newSquad = SquadHeroes.newHeroSquad();
        assertEquals(0,newSquad.getSquadId());
    }

    @Test public void testGetsAllInstancesOfNewHeroSquad(){
        SquadHeroes newSquad = SquadHeroes.newHeroSquad();
        assertTrue(SquadHeroes.getInstances().contains(newSquad));
    }
}