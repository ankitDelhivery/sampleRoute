package Controller;

import Resource.Address;
import Resource.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
        return "202: Data Accepted. Processing for Validation";
    }
}
