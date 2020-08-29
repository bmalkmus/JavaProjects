package DealershipProject;


public class Employee {
    String name;

    public Employee(String name) {
        super();
        this.name=name;
    }

    

    public void sellCar(Vehicle car, Customer customer){
        System.out.println("Good Afternoon, " + customer.name);
        if (car.available) {
            System.out.println("Yes, this is available. How would you like to pay for the vehicle?");
            if (customer.finance){
                System.out.println("I would like to finance");
                System.out.println("You will receive a $500 cash credit for financing");
                customer.cashOnHand += 500;
                double totalOwed = car.price - customer.cashOnHand;
                double payments = totalOwed * 1.08/60;
                System.out.println(
                        "Okay, here is your contract. The total price of the vehicle is  " 
                        + totalOwed + ". Your monthly payments for 5 years will be " 
                        + payments + ". IS that okay?"
                    );
                System.out.println("Yes that will be fine");
                System.out.println("---------signs contract and shakes hands---------");
            }
            else if(customer.cashOnHand > car.price){
                System.out.println("I would like to pay cash");
                System.out.println("-----Throws cash down on counter like a BOSS-------");
                customer.cashOnHand = customer.cashOnHand - car.price;
                System.out.println("Signs all the paperwork");
            }
            else {
                System.out.println("I was hoping to get it for free");
                System.out.println("I'm sorry sir, it dooesn't work like that. Have a good day");
            }
        }
        else {
            System.out.println("I'm sorry, but this vehicle is already purchased");
        }
    }
}