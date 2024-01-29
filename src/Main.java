import questions.Question1;
import questions.Question2;
import questions.Question3;
import questions.Question5;

public class Main {
    public static void main(String[] args) {

        // Question 1
        System.out.println("Question 1 Answer:\n");
        Question1.answer();
        System.out.println("\nPlease view questions/Question1.java to better understand the response\n");

        // Question 2
        System.out.println("Question 2 Answer:\n");
        Question2.answer();
        System.out.println("\nPlease view questions/Question2.java to better understand the response\n");

        // Question 3
        System.out.println("Question 3 Answer:\n");
        Question3.answer();
        System.out.println("\nPlease view questions/Question3.java to better understand the response\n");

        // Question 4
        System.out.println("Question 4 Answer:\n");
        System.out.println("The answer is the following: \n0 \n2 \n6 \n14\n");
        System.out.println("""
                The reasoning behind this response, is because of how the pre-increment and post-increment
                operators work. When sent to the increment() function it does the '++i' operation first. So if
                i was 0, it would increment it to be 1 so the first value to be added would be 1. After that,
                'i++' is used to increment the value of i to 2, but that will be done after 'i++' is resolved as 1
                for the formula. So the first return value would be 2. After that when i is passed in as the value
                of 2, '++i' resolves as 3 and 'i++' is resolved as 3 before it is incremented to 4, and so on.\s""");
        System.out.println("\nPlease view questions/Question4.java to better understand the response\n");

        // Question 5
        System.out.println("Question 5 Answer:\n");
        String challengingString = "  Java & Python: 2 Leading Languages! Isn't it fascinating? e.g., AI, VR, and IoT are revolutionizing... 21st Century! ";
        Question5.parseStringForFirstLetters(challengingString);
        System.out.println("\n\nPlease view questions/Question5.java to better understand the response\n");

        // Question 7
        System.out.println("Question 7 Answer:\n");
        System.out.println("The answer is the following: Fido");
        System.out.println("""
                The reasoning behind is because of pass-by-value. Pass-By-Reference occurs when you call a function with
                parameter and you send a reference of that object as a parameter. In Java, when you send an
                object as a parameter, a copy of that object's reference is given to the function and not the original
                object. Other languages, like C++, can be what is called pass-by-reference, but Java is strictly
                pass-by-value.\s""");
    }
}