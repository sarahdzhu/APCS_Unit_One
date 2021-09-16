import java.util.Scanner;

public class RoundTenth {

    public static void main(String[] args)
    { Scanner scan=new Scanner(System.in);
        System.out.print("Decimal number? ");
        double number=scan.nextDouble();
        double roundedNumber=10*number;
        double finalNumber=(int)(roundedNumber+0.5);
        double result=finalNumber/10;
        System.out.println(number+" rounded to the nearest tenth is "+ result);

        // Create a Scanner object

        // Prompt the user for a positive decimal number


        /*Use an expression to calculate
         * the rounded value and assign
         * that value to a variable named
         * rounded.*/


        // Print the output in the form:
        // 11.487 rounded to the nearest tenth is 11.5


    }
}
