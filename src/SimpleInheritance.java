public class SimpleInheritance {

    public static void main(String[] args) {
        ClassA superOb = new ClassA();
        ClassB subOb = new ClassB();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Content of superOb : " );
        superOb.showij();
        System.out.println();


        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("content : ");
        subOb.showij();
        subOb.showk();
        System.out.println("Sum of i, j and k  in subOb: ");
        subOb.sum();
    }


}
