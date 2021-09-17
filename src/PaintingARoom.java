
import java.util.Scanner;
public class PaintingARoom {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Find out how many gallons of paint you need to paint your room!");
        System.out.println("Please enter the following values.");
        System.out.print("Length(ft): ");
        double length=scan.nextDouble();
        System.out.print("Width(ft): ");
        double width=scan.nextDouble();
        System.out.print("Height(ft): ");
        double height=scan.nextDouble();
        System.out.print("Number of doors: ");
        int door=scan.nextInt();
        System.out.print("Number of windows: ");
        int window=scan.nextInt();
        double surfaceArea=(2*width*length+2*height*length+2*height*width)-(15*door-10*window);
        double gallonPaint=surfaceArea/350;
        int roundedGallon=(int)(gallonPaint*10+10-1)/10;
        System.out.println("You will need "+roundedGallon+" gallons of paint!");
        System.out.println("You should've just hired someone to paint your room!");




    }

}
