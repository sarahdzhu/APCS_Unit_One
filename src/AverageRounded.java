import java.util.Scanner;

public class AverageRounded {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter three positive decimal numbers: ");
        double number1=scan.nextDouble();
        double number2=scan.nextDouble();
        double number3=scan.nextDouble();
        double result=(int)(number1+number2+number3+0.5)/3;
        System.out.println("Average = "+(int)result);





    }
}
