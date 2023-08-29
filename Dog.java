public class Dog {
    private String name;
    private int age ;
    private String color;
    private String breed;
    private int weight;

    // Constructor
    public Dog(String name, int age, String color, String breed, int weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.weight = weight;

    }

    //Methods
    public void bark() {
        System.out.println(name + " says Woof Woof ");

    }

    public void eat() {
        System.out.println(name + " is eating ");

    }

    public void sit() {
        System.out.println(name + " is sitting ");

    }

    public void run() {
        System.out.println(name + " is running ");

    }

    public void play() {
        System.out.println(name + " is playing ");

    }

    public void sleep() {
        System.out.println(name + " is sleeping ");
    }


    }