import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double diagonal = 0;
        double perimeter = 0;
        double area = 0;
        String trash = "";
        boolean done = false;
        boolean done2 = false;

        do {

            System.out.print("Enter the width of the rectangle: ");

            if (in.hasNextDouble()) {
                width = in.nextDouble();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Please enter a numerical value, not " + trash);
            }

        } while (!done);

        do {

            System.out.print("Enter the height of the rectangle: ");

            if (in.hasNextDouble()) {
                height = in.nextDouble();
                done2 = true;
            } else {
                trash = in.nextLine();
                System.out.println("Please enter a numerical value, not " + trash);
            }

        } while (!done2);

        area = width * height;
        perimeter = (width * 2) + (height * 2);
        diagonal = java.lang.Math.sqrt((width * width) + (height * height));

        System.out.println("The area of the rectangle is " + area + " and the perimeter is " + perimeter);
        System.out.println("The diagonal of the rectangle is " + diagonal);


    }
}


