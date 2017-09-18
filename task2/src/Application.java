import java.util.Random;

public class Application {
    public static final int NUM_STUDENTS = 5;

    public static void main(String[] args) {
        Random rand = new Random();
        int[] results = new int[NUM_STUDENTS];

        for (int i = 0; i < NUM_STUDENTS; i++) {
            results[i] = rand.nextInt(5) + 1;
        }

        int sum = 0;
        for (int i = 0; i < NUM_STUDENTS; i++) {
            sum += results[i];
            System.out.println(results[i]);
        }

        double avg = (double) sum / NUM_STUDENTS;

        System.out.println("average = " + avg);


    }
}
