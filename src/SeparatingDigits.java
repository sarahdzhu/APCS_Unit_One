import java.util.Scanner;
 public class SeparatingDigits {

    public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
System.out.println("Type the number: ");
int number=scan.nextInt();

int first= number / 10000;
int firstRemain= number % 10000;
int second= firstRemain / 1000;
int secondRemain= number % 1000;
int third= secondRemain / 100;
int thirdRemain= number % 100;
int forth= thirdRemain / 10;
int forthRemain= number % 10;
int fifth =forthRemain/ 1;

System.out.println(first+" "+second+" "+third+" "+forth+" "+fifth);



    }
}
