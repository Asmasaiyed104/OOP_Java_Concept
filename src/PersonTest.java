public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Asma",33);

        System.out.println ("Initial Name : " + person.getName());
        System.out.println ("Initial Age : " + person.getAge());
        person.setAge(25);
        person.setName("Shruti");


        System.out.println ("Updated Name : " +  person.getName());
        System.out.println ("Updated Age : " +  person.getAge());

    }
}
