public class Dog{
    private String name;
    private int age;
    private Size size;
    private Breed breed;
    private Color color;

    //Constructors for Snoopy
    public Dog(String name, int age, Size size, Breed breed, Color color) {
        this.name = name;
        this.age = age;
        this.size = size;
        this.breed = breed;
        this.color = color;
    }
    // Constructor for Spot
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.size = Size.SMALL;
        this.breed = Breed.POODLE;
        this.color = Color.WHITE;
    }

    // Constructor for Wolf
    public Dog(String name, Breed breed) {
        this.name = name;
        this.age = 1;
        this.size = Size.LARGE;
        this.breed = Breed.DANE;
        this.color = Color.BLACK;
    }

    //Getters and Setters methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Size getSize() {
        return size;
    }

    public Breed getBreed() {
        return breed;
    }

    public Color getColor() {
        return color;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setsize(Size size) {
        this.size = size;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Dogs behavior actions
    public void bark() {
        System.out.println(name + "says Woof Woof");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void play() {
        System.out.println(name + " is playing.");
    }

    public void poop() {
        System.out.println(name + " is pooping.");
    }









    }



















