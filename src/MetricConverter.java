import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean done = false;
        double metric = 0;
        double inch = 39.37;
        double foot = 3.28;
        double mile = 1609.35;
        String trash = "";
        String inches = "Inches";
        String feet = "Feet";
        String miles = "Miles";

        do {
            System.out.print("Enter the measurement in meters: ");
            if (in.hasNextDouble()) {
                metric = in.nextDouble();
                done = true;
                in.nextLine();
            } else {
                trash = in.nextLine();
                System.out.println("Please enter a numerical value, not " + trash);
            }

        } while (!done);
        inch = metric * inch;
        foot = metric * foot;
        mile = metric / mile;

        System.out.println();

        System.out.printf("%-12s %-12s %-10s", inches, feet, miles);
        in.nextLine();
        System.out.printf("%-12.3f %-12.3f %-10.3f", inch, foot, mile);

        }


    }

