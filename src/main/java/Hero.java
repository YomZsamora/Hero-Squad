import java.util.*;

public class Hero {
   private String heroName;
   private String heroAge;
   private String heroAbility;
   private String heroWeakness;

   public Hero(String hero_name, String hero_age, String ability, String weakness){
      heroName = hero_name;
      heroAge = hero_age;
      heroAbility = ability;
      heroWeakness = weakness;
   }

   public String getName(){
      return heroName;
   }

   public String getAge(){
      return heroAge;
   }

   public String getAbility(){
      return heroAbility;
   }

   public String getWeakness(){
      return heroWeakness;
   }
}
