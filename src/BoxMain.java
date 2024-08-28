public class BoxMain {

    public static void main(String[] args) {

        Box myBox1 = new Box(4,6,9);
        Box myBox2 = new Box(14,4,56);



        myBox1.volume();

        System.out.println( "myBox1 vol is : " + myBox1.volume());

      myBox2.volume();
        System.out.println("myBox2 vol is : " + myBox2.volume());


    }

    }
