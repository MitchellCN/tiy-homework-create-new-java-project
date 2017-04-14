import com.spring3.Person;
import com.spring3.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * Created by cmitchell on 4/13/17.
 */
//adding @Controller

//When Spring loads it scans all the classes in the application. any classes annotated with @Controller is automatically
// loaded and configured to handle http requests. Controller methods return a String that is the name of an HTML file in the
///src/main/resources/templates directory. Spring automatically loads the file and returns its content in the HTTP response.
// Because the person(  method returns"person the person.html is going to be shown



@Controller
public class PeopleController {


    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/")
            //(path = "/person", method = RequestMethod.GET)
    public String person(Model model, String search) {

        model.addAttribute("search", search);
        model.addAttribute("people", personRepository.listPeople(search));

        return "person";
    }

    @RequestMapping("/describeMeForm")

    public String describeMeForm() {

        return "describeMeForm";


    }

// first method of describeMeform() responds to GET requests for /describeMe and simply shows the form
 //   @RequestMapping(path = "/describeMe", method = RequestMethod.GET)
 //   public String describeMeForm(){
  //      return "describeMeForm";
  //  }

   // @RequestMapping(path = "/describeMe", method = RequestMethod.POST)
   // public String describeMe(Model model, String name, String city, Integer age){

        // create our person
      //  Person person = new Person(name, city, age == null ? 0 : age);

        // put the person into our model
       // model.addAttribute("person", person);

      //  return "person";


}
