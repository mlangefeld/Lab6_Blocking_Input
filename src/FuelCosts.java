import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double galInTank = 0;
        double fuelEfic = 0;
        double gasPrice = 0;
        double costPer100 = 0;
        double howFar = 0;
        String trash = "";
        boolean done = false;
        boolean done2 = false;
        boolean done3 = false;

        do {

            System.out.print("Enter the amount of gallons of gas currently in your tank: ");

            if (in.hasNextDouble()) {
                galInTank = in.nextDouble();
                in.nextLine();
                done = true;

            } else {
                trash = in.nextLine();
                System.out.println("Please enter a numerical value, not " + trash);
            }

        } while (!done);

        do {

            System.out.print("Enter the fuel efficiency in miles per gallon: ");

            if (in.hasNextDouble()) {
                fuelEfic = in.nextDouble();
                in.nextLine();
                done2 = true;

            } else {
                trash = in.nextLine();
                System.out.println("Please enter a numerical value, not " + trash);
            }

        } while (!done2);

        do {

            System.out.print("Enter the price of gas per gallon: ");

            if (in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                in.nextLine();
                done3 = true;

            } else {
                trash = in.nextLine();
                System.out.println("Please enter a numerical value, not " + trash);
            }

        } while (!done3);
        howFar = galInTank * fuelEfic;
        costPer100 = (100 / fuelEfic) * gasPrice;

        System.out.println("With a fuel efficency of " + fuelEfic + " miles per gallon, it will cost you " + costPer100 + " to travel 100 miles.");
        System.out.println("With " + galInTank + " gallons of gas in the tank, you can travel " + howFar + " miles.");
    }
}
