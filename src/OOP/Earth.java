package OOP;

public class Earth {
    public static void main(String[] args) {
        Human tom = new Human();
        tom.age=5;
        tom.eyeColor="brown";
        tom.heightInInches=72;
        tom.name="Tom Zsabo";
        tom.speak();

        Human joe = new Human();
        joe.age=42;
        joe.eyeColor="Green";
        joe.name="Joe Rogan";
        joe.heightInInches=32;

        joe.speak();
    }
}