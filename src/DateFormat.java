import java.util.Scanner;

public class DateFormat {

    public static void main(String[] args) {
        System.out.println("What is the current month?");
        Scanner scan =new Scanner(System.in);
        String month =scan.nextLine();
        System.out.println("What is the current day of the week?");
        String day= scan.nextLine();
        System.out.println("What is the current year?");
        int year=scan.nextInt();
        System.out.println("What is the current day of the month?");
        int date=scan.nextInt();
        System.out.println("American Format:");
        System.out.println(day+","+ month+" "+date+","+year);
        System.out.println("European Format:");
        System.out.println(day+","+date+" "+ month+","+" "+year);





    }
}
