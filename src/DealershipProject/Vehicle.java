package DealershipProject;

public class Vehicle {
    String make;
    String model;
    int year;
    String color;
    boolean available = true;
    int price;
    public Vehicle (String make, String model, int year, String color, int price){
        super();
        this.make=make;
        this.model=model;
        this.year=year;
        this.color=color;;
        this.price=price;
    }
}