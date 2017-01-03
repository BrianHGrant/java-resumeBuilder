import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("jobs", request.session().attribute("jobs"));
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/jobs", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      ArrayList<Job> jobs = request.session().attribute("jobs");
      if (jobs == null) {
        jobs = new ArrayList<Job>();
        request.session().attribute("jobs", jobs);
      }

      String title = request.queryParams("title");
      String company = request.queryParams("company");
      String location = request.queryParams("location");
      String description = request.queryParams("description");
      String startDate = request.queryParams("startDate");
      String endDate = request.queryParams("endDate");
      Boolean employed = Boolean.parseBoolean(request.queryParams("employed"));
      Job newJob = new Job(title, company, location, description, startDate, endDate, employed);
      jobs.add(newJob);

      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
