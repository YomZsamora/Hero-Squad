import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

	@Test
	public void Hero_instantiatesCorrectly_true() {
		Hero myHero = new Hero("Spiderman", "16", "Enhanced Senses", "Magic", "New Avengers");
		assertEquals(true, myHero instanceof Hero);
	}

	@Test
  	public void Hero_instantiatesWithHeroName_String() {
  		Hero myHero = new Hero("Spiderman", "16", "Enhanced Senses", "Magic", "New Avengers");
    	assertEquals("Spiderman", myHero.getName());
  	}

  	@Test
  	public void Hero_instantiatesWithHeroAge_String() {
  		Hero myHero = new Hero("Spiderman", "16", "Enhanced Senses", "Magic", "New Avengers");
    	assertEquals("16", myHero.getAge());
  	}

   @Test
   public void Hero_instantiatesWithHeroAbility_String() {
      Hero myHero = new Hero("Spiderman", "16", "Enhanced Senses", "Magic", "New Avengers");
      assertEquals("Enhanced Senses", myHero.getAbility());
   }

   @Test
   public void Hero_instantiatesWithHeroWeakness_String() {
      Hero myHero = new Hero("Spiderman", "16", "Enhanced Senses", "Magic", "New Avengers");
      assertEquals("Magic", myHero.getWeakness());
   }

   @Test
   public void all_returnsAllInstancesOfHero_true() {
      Hero firstHero = new Hero("Spiderman", "16", "Enhanced Senses", "Magic", "New Avengers");
      Hero secondHero = new Hero("Superman", "39", "Invulnerability", "Kryptonite", "Justice League");
      assertEquals(true, Hero.all().contains(firstHero));
      assertEquals(true, Hero.all().contains(secondHero));
   }

   @Test
   public void clear_emptiesAllHeroesFromArrayList_0() {
      Hero firstHero = new Hero("Spiderman", "16", "Enhanced Senses", "Magic", "New Avengers");
      Hero.clear();
      assertEquals(Hero.all().size(), 0);
   }
}