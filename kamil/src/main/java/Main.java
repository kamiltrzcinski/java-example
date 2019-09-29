import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("how many fibonacci numbers do you want?: ");
        int ie = Integer.valueOf(reader.readLine());

        for (int i : fibonacciSequence(ie)) {
            System.out.println(i);
        }

    }

    public static int[] fibonacciSequence(int reader) {

        int[] fibonacci = new int[reader];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int j = 2; j < fibonacci.length; j++) {
            fibonacci[j] = fibonacci[j - 1] + fibonacci[j - 2];
        }
        return fibonacci;
    }
}
