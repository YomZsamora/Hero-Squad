import java.util.*;

public class Hero {
   private String heroName;
   private int heroAge;
   private String heroAbility;
   private String heroWeakness;

   public Hero(String hero_name, int hero_age, String ability, String weakness){
      heroName = hero_name;
      heroAge = hero_age;
      heroAbility = ability;
      heroWeakness = weakness;
   }

   public String getName(){
      return heroName;
   }

   public int getAge(){
      return heroAge;
   }

   public String getAbility(){
      return heroAbility;
   }

   public String getWeakness(){
      return heroWeakness;
   }
}
