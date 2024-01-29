package questions;

public class Question4 {
    private static int increment(int i) {
        return (++i) + (i++);
    }

    public static void answer() {
        for(int i = 0; i < 25; i = increment(i)) {
            System.out.println(i);
        }
    }
}
