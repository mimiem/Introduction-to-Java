import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**Write a program that converts the decimal number system to the ghetto numeral system. In the ghetto,
 numbers are represented as following:
 	0 – Gee
 	1 – Bro
 	2 – Zuz
 	3 – Ma
 	4 – Duh
 	5  - Yo
 	6 – Dis
 	7 – Hood
 	8 – Jam
 	9 – Mack

   Input   Output
   6781	   DisHoodJamBro
   9374	   MackMaHoodDuh
   533	   YoMaMa
   102	   BroGeeZuz

 * Created by User1 on 20.3.2016 г..
 */
public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        List<String> ghetto = new ArrayList<String>();
        int key = 0;

        while (n > 0) {
            key = n % 10;
            n /= 10;
            String digit = "";

            switch (key) {
                case 0:
                    digit = "Gee";
                    break;
                case 1:
                    digit = "Bro";
                    break;
                case 2:
                    digit = "Zuz";
                    break;
                case 3:
                    digit = "Ma";
                    break;
                case 4:
                    digit = "Duh";
                    break;
                case 5:
                    digit = "Yo";
                    break;
                case 6:
                    digit = "Dis";
                    break;
                case 7:
                    digit = "Hood";
                    break;
                case 8:
                    digit = "Jam";
                    break;
                case 9:
                    digit = "Mack";
                    break;
            }
            ghetto.add(digit);
        }

        for (int i = ghetto.size() - 1; i >= 0; i--) {
            System.out.print(ghetto.get(i));
        }
    }
}
