import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class puzzleTest {
    public static void main(String[] args) {
        puzzleJava.sumAndGreaterThan(new int[]{3,5,1,2,7,9,8,13,25,32});
        ArrayList<String> newHome = new ArrayList<String>();
        newHome.add("Bob");
        newHome.add("Jen");
        newHome.add("Ray");
        newHome.add("Mo");
        newHome.add("Chuck");
        puzzleJava.arrayHome(newHome);

        puzzleJava.arrayAlpha();

        puzzleJava.getRandom();

        puzzleJava.getRandomSort();

        puzzleJava.randomString();

        puzzleJava.randomStringArray();


        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);

        Collections.shuffle(numbers);
        System.out.println(numbers); // [1, 5, 2, 4, 3]
        Collections.sort(numbers);
        System.out.println(numbers); // [1, 2, 3, 4, 5]

        Random r = new Random();
        System.out.println(r.nextInt()); // without bounds
        System.out.println(r.nextInt(5)); // with bounds 0 to 5
    }
}
