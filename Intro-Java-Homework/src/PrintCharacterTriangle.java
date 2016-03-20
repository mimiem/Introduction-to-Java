import java.util.Scanner;

/**
 * Create a triangle of characters, based on input. Learn about java.util.Scanner
 and Integer.parseInt (). Test your program with integers up to 26. Think why.
Input	  Output
   3	  a
          a b
          a b c
          a b
          a
 * Created by User1 on 20.3.2016 г..
 */
public class PrintCharacterTriangle {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (j + 97) + " ");
            }
            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (j + 97) + " ");
            }
            System.out.println();
        }
    }
}
