package address;

public class AddressMain {

    public static void main(String[] args) {
        Address address1= new Address("anand "," gujarat "," India ");
        Address address2 = new Address("noida "," Delhi "," India ");

        Emp e = new Emp(" Asma ",address1, 123);
        Emp e2 =new Emp(" Aman ",address2, 234);

        e2.display();
        e.display();
    }
}
