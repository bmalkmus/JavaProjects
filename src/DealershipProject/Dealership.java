package DealershipProject;

public class Dealership {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John");
        Vehicle car1 = new Vehicle("Toyota", "Camry", 2020, "Blue", 39500);
        Customer customer1 = new Customer("Jimmy", 5000, true);

        System.out.println(emp1.name);
        System.out.println(car1.color);
        System.out.println(customer1.name);

        Customer.wantsToBuyCar(car1, emp1);
    }
}