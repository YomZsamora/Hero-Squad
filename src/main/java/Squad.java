import java.util.*;

public class Squad {
   private List<Hero> squadMembers = new ArrayList<Hero>();
   private String squadName;
   private int maxSize;
   private String squadCause;

   public Squad (String squad_name, int squad_size, String squad_cause){
      squadName = squad_name;
      maxSize = squad_size;
      squad_cause = squad_cause;
   }

   public List<Hero>  getSquadMembers(){
      return squadMembers;
   }

   public int getSquadSize(){
      return squadMembers.size();
   }

   public int getMaxSize(){
      return maxSize;
   }

   public String getSquadName(){
      return squadName;
   }

   public String getSquadCause(){
      return squadCause;
   }

   public String addHero(Hero newHero){
      if (squadMembers.size() < maxSize){
         squadMembers.add(newHero);
         return "Successfully added hero";
      } else {
         return "Squad is at maximum size";
      }
   }
}
