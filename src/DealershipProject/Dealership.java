package DealershipProject;

public class Dealership {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John");
        Vehicle car1 = new Vehicle("Toyota", "Camry", 2020, "Blue", 39500);
        Customer customer1 = new Customer("Jimmy",60000, false);

        customer1.wantsToBuyCar(car1, emp1);
        
    }
}