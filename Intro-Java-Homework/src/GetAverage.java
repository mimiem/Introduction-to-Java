import java.util.Scanner;

/**Create a method that finds the average of three numbers. Read in internet about java methods.
 Check the naming conventions. Invoke your method and test it. Format the output to two digits
 after the decimal separator. The placeholder is %.2f

 a	    b	  c	     Average
 1.5	2.5	  3.8	 2.60
 12	    13	  25	 16.67
 0.005	0.5	  0.55	 0.35
 0	    0	  2	     0.67

 * Created by User1 on 20.3.2016 г..
 */
public class GetAverage {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();
        System.out.printf("%.2f", GetAverage(a, b, c));
    }

    public static double GetAverage(double a, double b, double c) {
        double average = (a + b + c) / 3.0;
        return average;
    }
}
