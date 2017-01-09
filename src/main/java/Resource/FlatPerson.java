package Resource;

/**
 * Created by delhivery on 9/1/17.
 */
public class FlatPerson {

    private String firstName;
    private String lastName;
    private int address_house;
    private String address_street;
    private String address_city;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAddress_house() {
        return address_house;
    }

    public void setAddress_house(int address_house) {
        this.address_house = address_house;
    }

    public String getAddress_street() {
        return address_street;
    }

    public void setAddress_street(String address_street) {
        this.address_street = address_street;
    }

    public String getAddress_city() {
        return address_city;
    }

    public void setAddress_city(String address_city) {
        this.address_city = address_city;
    }

    @Override
    public String toString(){
        return "firstName: "+firstName+", lastName: "+lastName+", lives at address: "+address_house+", "+address_street+", "+address_city;
    }
}
