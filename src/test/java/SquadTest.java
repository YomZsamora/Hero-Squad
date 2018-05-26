import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

   @Test
   public void Squad_instantiatesCorrectly_true() {
      Squad mySquad = new Squad("Avengers", "16", "Prevent Alien Invasion");
      assertEquals(true, mySquad instanceof Squad);
   }

   @Test
   public void Squad_instantiatesWithSquadName_String() {
      Squad mySquad = new Squad("Avengers", "16", "Prevent Alien Invasion");
      assertEquals("Avengers", mySquad.getSquadName());
   }

   @Test
   public void Squad_instantiatesWithSquadMaxSize_int() {
      Squad mySquad = new Squad("Avengers", "16", "Prevent Alien Invasion");
      assertEquals(16, mySquad.getMaxSize());
   }

   @Test
   public void Squad_instantiatesWithSquadCause_String() {
      Squad mySquad = new Squad("Avengers", "16", "Prevent Alien Invasion");
      assertEquals("Prevent Alien Invasion", mySquad.getSquadCause());
   }

   @Test
   public void all_returnsAllInstancesOfSquad_true() {
      Squad firstSquad = new Squad("Avengers", "16", "Prevent Alien Invasion");
      Squad secondSquad = new Squad("Justice League", "8", "Justice to All");
      assertEquals(true, Squad.all().contains(firstSquad));
      assertEquals(true, Squad.all().contains(secondSquad));
   }

   @Test
   public void clear_emptiesAllSquadsFromArrayList_0() {
      Squad firstSquad = new Squad("Avengers", "16", "Prevent Alien Invasion");
      Squad.clear();
      assertEquals(Squad.all().size(), 0);
   }

   @Test
   public void all_returnsIdOfEachSquad_int() {
      Squad.clear();
      Squad firstSquad = new Squad("Avengers", "16", "Prevent Alien Invasion");
      assertEquals(1, firstSquad.getId());
   }

   @Test
   public void find_returnsSquadWithSameId_secondSquad() {
      Squad firstSquad = new Squad("Avengers", "16", "Prevent Alien Invasion");
      Squad secondSquad = new Squad("Justice League", "8", "Justice to All");
      assertEquals(Squad.find(secondSquad.getId()), secondSquad);
   }

   @Test
   public void addHero_addsHeroToSquadList_true() {
      Squad mySquad = new Squad("Avengers", "16", "Prevent Alien Invasion");
      Hero myHero = new Hero("Spiderman", "16", "Enhanced Senses", "Magic", "New Avengers");
      mySquad.addHero(myHero);
      assertTrue(mySquad.getHeroes().contains(myHero));
   }

   @Test
   public void currentSize_getCurrentSizeOfSquadList_int() {
      Squad.clear();
      Squad mySquad = new Squad("Avengers", "16", "Prevent Alien Invasion");
      assertEquals(0, mySquad.getCurrentSize());
   }



}