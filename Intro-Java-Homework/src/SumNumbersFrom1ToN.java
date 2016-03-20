import java.util.Scanner;

/**
 * Create a Java program that reads a number N from the console and calculates the
 sum of all numbers from 1 to N (inclusive).
Input	Output
 12	     78
 1	     1
 5	     15
 * Created by User1 on 20.3.2016 г..
 */
public class SumNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
