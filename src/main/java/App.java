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


    // 	post("/newHero", (request, response) -> {
	  	// 	Map<String, Object> model = new HashMap<String, Object>();

	  	// 	ArrayList<Task> newHero = request.session().attribute("hero_squad");
	  	// 	if (newHero == null) {
	  	// 		newHero = new ArrayList<Task>();
	  	// 		request.session().attribute("newHero", newHero);
	  	// 	}

	  	// 	String description = request.queryParams("description");
	  	// 	Task newTask = new Task(description);
	  	// 	tasks.add(newTask);

	  	// 	model.put("template", "templates/success.vtl");
	  	// 	return new ModelAndView(model, layout);
	  	// }, new VelocityTemplateEngine());
  	}


}