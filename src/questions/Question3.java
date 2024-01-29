package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;


public class Question3 {
    public static void answer() {
        // Generate a list of numbers ranging from 1 to 100
        // With a 1 to 10 chance of a null being added in place of the number
        List<Integer> listOfNumbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int randomNumber = rand.nextInt(10);

            if (randomNumber != 7) {
                listOfNumbers.add(i);
            }
            else {
                listOfNumbers.add(null);
            }
        }
        /*
         *  Using streams, we can create a list of objectives, or a stream, to fulfill our need to get the sum.
         *  However, the events have to be done in order according to the Java Documentation.
         *  First, we use .filter to only return a regular stream of non-null objects.
         *  Secondly, we have to convert the Integer objects to their primitive datatype.
         *  Finally, we can use the returned IntStream to get the sum of the remaining ints.
         */
        int sumOfList = 0;
        sumOfList = listOfNumbers.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).sum();

        System.out.println("The total of the randomly generated list of 100 possible numbers is: " + sumOfList);
    }
}
