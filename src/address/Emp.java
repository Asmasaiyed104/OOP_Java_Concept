package address;
// this is parent class
// it holds address object and address is a subclass
public class Emp {

    int id;
    String name;
    Address address;

    public Emp(String name, Address address, int id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    void display(){
        System.out.println(id +""+name);
        System.out.println(address.city+""+address.state+address.country);
    }
}
