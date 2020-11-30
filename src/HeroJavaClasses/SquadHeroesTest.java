package HeroJavaClasses;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquadHeroesTest {

    @Test public void testGetsNameOfNewHeroSquad(){
        SquadHeroes newSquad = SquadHeroes.newHeroSquad();
        assertEquals("Marvel",newSquad.getSquadName());
    }
}