package HeroJavaClasses;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyHeroTest {

    @Test public void testGetsNameOfNewCharacter(){
        MyHero newCharacterHero = MyHero.newHeroCharacter();
        assertEquals("IceBreath", newCharacterHero.getHeroName());
    }
}