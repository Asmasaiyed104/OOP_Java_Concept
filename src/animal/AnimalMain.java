package animal;

public class AnimalMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.color="red";

        Cat cat = new Cat();
        cat.mew();


        BabyDog babyDog = new BabyDog();
        babyDog.weep();
    }
}
