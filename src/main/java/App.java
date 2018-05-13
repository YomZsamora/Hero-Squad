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
      		model.put("hero_squad", request.session().attribute("hero_squad"));
      		model.put("template", "templates/index.vtl");
      		return new ModelAndView(model, layout);
    	}, new VelocityTemplateEngine());

    	post("/newHero", (request, response) -> {
    		Map<String, Object> model = new HashMap<String, Object>();

		    ArrayList<Hero> heroes = request.session().attribute("hero_squad");
		    if (heroes == null) {
		      	heroes = new ArrayList<Hero>();
		      	request.session().attribute("hero_squad", heroes);
		    }

    		String heroName = request.queryParams("hero_name");
    		String heroAge = request.queryParams("hero_age");
    		String heroAbility = request.queryParams("hero_ability");
    		String heroWeakness = request.queryParams("hero_weakness");
    		String heroSquad = request.queryParams("hero_squad");
    		Hero newHero = new Hero(heroName,heroAge,heroAbility,heroWeakness,heroSquad);
    		heroes.add(newHero);

    		model.put("template", "templates/hero_added.vtl");
    		return new ModelAndView(model, layout);
   		}, new VelocityTemplateEngine());
  	}


}