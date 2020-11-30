package HeroJavaClasses;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyHeroTest {

    @Test public void testGetsNameOfNewCharacter(){
        MyHero newCharacterHero = MyHero.newHeroCharacter();
        assertEquals("IceBreath", newCharacterHero.getHeroName());
    }

    @Test public void testGetsSpecialPowerOfNewCharacter(){
        MyHero newCharacterHero = MyHero.newHeroCharacter();
        assertEquals("ice breath", newCharacterHero.getSpecial_power());
    }

    @Test public void testGetsFlawOfNewCharacter(){
        MyHero newCharacterHero = MyHero.newHeroCharacter();
        assertEquals("heat", newCharacterHero.getFlaw());
    }

    @Test public void testGetsAgeOfNewCharacter(){
        MyHero newCharacterHero = MyHero.newHeroCharacter();
        assertEquals( 17, newCharacterHero.getAge());
    }

    @Test public void testGetsAllInstancesOfNewCharacter(){
        MyHero newCharacterHero = MyHero.newHeroCharacter();
        assertTrue(MyHero.getAllInstances().contains(newCharacterHero));
    }

    @Test public void testGetsIdOfNewCharacter(){
        MyHero newCharacterHero = MyHero.newHeroCharacter();
        assertEquals( 1, newCharacterHero.getId());
    }
}