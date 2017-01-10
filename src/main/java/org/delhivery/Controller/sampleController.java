package org.delhivery.Controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.camel.Body;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.ProducerTemplate;
import org.delhivery.Resource.FlatPerson;
import org.delhivery.Resource.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;



@RestController
@RequestMapping("test")
public class sampleController {
    @Autowired
    private ProducerTemplate producerTemplate;

    @RequestMapping(path="/postX", method = RequestMethod.POST)
    public String postX(@RequestBody ArrayList<Person> people) throws JsonProcessingException {

        for(Person person: people) {
            System.out.println(person.toString());
        }
        producerTemplate.sendBody("direct:formatX", people);

        return "202: Nested Data Accepted. Processing for Validation";
    }

    @RequestMapping(path="/postY", method=RequestMethod.POST)
    public String  postY(@RequestBody ArrayList<FlatPerson> people){
        for (FlatPerson person: people){
            System.out.println(people.toString());
        }

        return "202: Flattened Data Accepted. Processing for Validation";
    }
}
