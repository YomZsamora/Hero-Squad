import java.util.*;

public class Hero {
   private String heroName;
   private String heroAge;
   private String heroAbility;
   private String heroWeakness;
   private String heroSquad;

   public Hero(String hero_name, String hero_age, String ability, String weakness, String hero_squad){
      heroName = hero_name;
      heroAge = hero_age;
      heroAbility = ability;
      heroWeakness = weakness;
      heroSquad = hero_squad;
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

   public String getSquad(){
      return heroSquad;
   }
}
