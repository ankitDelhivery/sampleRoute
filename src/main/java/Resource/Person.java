package Resource;


import javax.validation.Valid;

public class Person {

    private String firstName;
    private String lastName;
    @Valid
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString(){
        return "firstName: " + firstName +", lastName: " + lastName +" lives at, address: {" + address.toString()+"}";
    }
}
