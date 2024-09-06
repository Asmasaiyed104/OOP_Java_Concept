package animal;

/*
* it contains  single, multilevel and hierarchical inheritance */

public class Lion {
    String breed;
    String color;

    public Lion(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }

    public void eat(){
        System.out.println("eating other animals");
    }



    public static void main(String[] args) {

        Lion lion = new Lion("african","red");
        Cat cat = new Cat("canadian","white",2);
        Mouse mouse = new Mouse ("american","brown", 4);
        Wildcat wildcat = new Wildcat("american", "red","giant");


        cat.eat();
        mouse.eatCrop();
        wildcat.diplay();

    }
}

class Cat extends Lion{

    int numOf;


     public Cat(String breed, String color, int numOf) {
        super(breed, color);
        this.numOf = numOf;
    }
}
class Mouse extends Cat{
    public void eatCrop(){
        System.out.println("eating my crop");
    }

    public Mouse(String breed, String color, int numOf) {
        super(breed, color, numOf);
    }
}
class Wildcat extends Lion{

    String nails;

    public Wildcat(String breed,String color,String nails){
        super(breed, color);
        this.nails = nails;
    }

    void diplay(){
        System.out.println("Wildcat has " + breed + " breed  and  has " + color + " color with "+ nails + " nails.");
    }

}
