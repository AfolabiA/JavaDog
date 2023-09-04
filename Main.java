public class Main {
    public static void main(String[] args) {
        Dog spot = new Dog("Spot", 2 , Size.SMALL, Breed.POODLE, Color.WHITE);
        Dog wolf = new Dog("Wolf", 3, Size.LARGE, Breed.DANE, Color.BLACK);
        Dog snoopy = new Dog("Snoopy", Breed.PUG);

        // DOG ACTIONS
        spot.bark();
        spot.eat();
        wolf.play();
        wolf.sleep();
        snoopy.eat();
        snoopy.poop();


    }
}

