package questions;

public class Question5 {
    public static void parseStringForFirstLetters(String stringToParse) {
        // If empty or null, don't continue through method
        if (stringToParse == null || stringToParse.isEmpty()) {
            return;
        }
        // Using the split() function with regex, we can split the string into separate words
        String[] separateWords = stringToParse.split("\\s+(?![&])");

        // Using a for each loop, every word is then checked to make sure that it isn't an empty string, then returned
        for (String word: separateWords) {
            if (!word.isEmpty()) {
                System.out.print(word.charAt(0) + " ");

            }
        }
    }
}
