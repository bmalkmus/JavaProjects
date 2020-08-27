package practice_strings;

public class PracticeStrings {
    public static void main(String[] args) {
        String a = "We have a large inventory of things in our warehouse falling in the category:apperal and the slightly more in demand category:makeup along with the category:furniture and.......";

        printCategories(a);
        


    }

    public static void printCategories(String a){
        int category = a.indexOf(":");
        int space = a.indexOf(" ", category);
        System.out.println(category);
        while (category != -1){
            System.out.println(a.substring(category+1, space));
            category = a.indexOf(":", category+1);
            space = a.indexOf(" ", category);

        }
    }
}