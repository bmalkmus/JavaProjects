package ApplicationPractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("there");
        // words.add(10);
        words.remove(0);

        String item1 = (String) words.get(0);

        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(45);
        numbers.add(100);
        numbers.add(100);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}