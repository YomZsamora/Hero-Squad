import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  	public static void main(String[] args) {
    	staticFileLocation("/public");
    	String layout = "templates/layout.vtl";

    	get("/", (request, response) -> {
      	Map<String, Object> model = new HashMap<String, Object>();
      	model.put("hero_squad", Hero.all());
      	model.put("squad_hero", Squad.all());
      	model.put("template", "templates/index.vtl");
      	return new ModelAndView(model, layout);
    	}, new VelocityTemplateEngine());

    	post("/newHero", (request, response) -> {
    		Map<String, Object> model = new HashMap<String, Object>();

    		String heroName = request.queryParams("hero_name");
    		String heroAge = request.queryParams("hero_age");
    		String heroAbility = request.queryParams("hero_ability");
    		String heroWeakness = request.queryParams("hero_weakness");
    		String heroSquad = request.queryParams("hero_squad");
         Squad newMember = Squad.find(Integer.parseInt(heroSquad));
    		Hero newHero = new Hero(heroName,heroAge,heroAbility,heroWeakness,heroSquad);
         newMember.addHero(newHero);

         model.put("newMember", newMember);
    		model.put("template", "templates/hero_added.vtl");
    		return new ModelAndView(model, layout);
   	}, new VelocityTemplateEngine());

   	post("/createSquad", (request, response) -> {
    		Map<String, Object> model = new HashMap<String, Object>();

    		String squadName = request.queryParams("squad_name");
    		String squadSize = request.queryParams("squad_size");
    		String squadCause = request.queryParams("squad_cause");
    		Squad newSquad = new Squad(squadName,squadSize,squadCause);

    		model.put("template", "templates/squad_added.vtl");
    		return new ModelAndView(model, layout);
   	}, new VelocityTemplateEngine());

      get("/squad/:id", (request, response) -> {
         Map<String, Object> model = new HashMap<String, Object>();
         Squad squadMembers = Squad.find(Integer.parseInt(request.params(":id")));
         model.put("squadMembers", squadMembers);
         model.put("template", "templates/squad.vtl");
         return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());
  	}
}