import java.util.Scanner;

public class CorrectChange {

    public static void main(String[] args) {

  int dollar;
  int dollarRemain;
  int quarter;
  int quarterRemain;
  int dime;
  int dimeRemain;
  int nickle;
  int nickleRemain;
  int penny;

  Scanner scan = new Scanner(System.in);
  System.out.println("Please enter a whole number of cents:");

  int change= scan.nextInt();

  dollar=change /100; //1
        dollarRemain=change %100; //63
        quarter= dollarRemain/ 25; //2
        quarterRemain=dollarRemain%25; //13
        dime=quarterRemain/ 10;
        dimeRemain=quarterRemain%10; //25
        nickle=dimeRemain/5;
        nickleRemain=dimeRemain %5;
        penny=dimeRemain/1;

        System.out.println("You have "+dollar+" dollars, "+quarter+" quarters, "+dime+" dimes, "+nickle+" nickles, and "+penny+" pennies.");





    }
}

