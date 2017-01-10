package org.delhivery.Controller;

//import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.delhivery.Resource.FlatPerson;
import org.delhivery.Resource.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class myProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {
        ArrayList<Person> newPeople =exchange.getIn().getBody(ArrayList.class);
        exchange.getOut().setBody(xToY(newPeople));
    }

    public ArrayList<FlatPerson> xToY(ArrayList<Person> people){
        ArrayList<FlatPerson> newPeople = new ArrayList<FlatPerson>();
        for (Person person: people){
            newPeople.add(new FlatPerson(person.getFirstName(),person.getLastName(),
                    person.getAddress().getHouse(),person.getAddress().getStreet(),
                    person.getAddress().getCity()));
        }
        return newPeople;
    }
}
