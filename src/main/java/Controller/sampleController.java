package Controller;


import Resource.FlatPerson;
import Resource.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("test")
public class sampleController {

    @RequestMapping(path="/postX", method = RequestMethod.POST)
    public String postX(@RequestBody List<Person> people) throws JsonProcessingException {

        for(Person person: people) {
            System.out.println(person.toString());
        }
        return "202: Nested Data Accepted. Processing for Validation";
    }

    @RequestMapping(path="/postY", method=RequestMethod.POST)
    public String  postY(@RequestBody List<FlatPerson> people){
        for (FlatPerson person: people){
            System.out.println(person.toString());
        }
        return "202: Flattened Data Accepted. Processing for Validation";
    }
}
