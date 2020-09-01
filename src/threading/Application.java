package threading;

public class Application {
    public static void main(String[] args) {
        Task taskRunner = new Task("I'm a thread");
        taskRunner.start();
        System.out.println("hello there...");
        System.out.println("hello there...");
        System.out.println("hello there...");
        System.out.println("hello there...");
        System.out.println("hello there...");
        System.out.println("hello there...");

    }
}

class Task extends Thread {
    String name;
    public Task (String name){
        this.name=name;
    }
    public void run () {
        Thread.currentThread().setName(name);
        for (int i = 0; i< 1000; i++){
            System.out.println(i + "--" + Thread.currentThread().getName());
        }
    }
}