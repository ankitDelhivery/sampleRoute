package Resource;

import java.util.ArrayList;

public class sampleResource {

    private ArrayList<Person> newPeople;

    public sampleResource(){

    }

    public sampleResource(ArrayList<Person> newPeople){
        this.newPeople = newPeople;
    }
    public ArrayList<Person> getNewPeople() {
        return newPeople;
    }




}
