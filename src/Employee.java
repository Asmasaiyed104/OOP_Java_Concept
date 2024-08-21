public class Employee {
    float salary = 40000;

    public static void main(String[] args) {

        Employee employee = new Employee();
        Programmer programmer = new Programmer();

        System.out.println("Programmer salary is " + employee.salary);
        programmer.getBonus();
    }

}

