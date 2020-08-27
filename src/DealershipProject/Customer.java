package DealershipProject;

public class Customer {
    String name;
    int cashOnHand;
    boolean finance;

    public Customer (String name, int cashOnHand, boolean finance){
        this.name = name;
        this.cashOnHand=cashOnHand;
        this.finance=finance;
    }

    public static void wantsToBuyCar(Vehicle car, Employee employee){
        System.out.println("Hello "+employee.name + " , I would like to buy this " + car.color + " " + car.model);
        System.out.println("Is it available?");
    }
}