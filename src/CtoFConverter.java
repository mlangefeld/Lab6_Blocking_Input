import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double f = 0;
        double c = 0;
        String trash = "";
        boolean done = false;

        do {

            System.out.print("Please enter the temperature in celsius to convert to fahrenheit: ");

            if (in.hasNextDouble()) {

                c = in.nextDouble();
                f = (c * 9 / 5) + 32;
                System.out.println(c + " in fahrenheit is " + f);

                done = true;

            } else {
                trash = in.nextLine();
                System.out.println("Please enter a numerical value, not " + trash);
            }

        } while (!done);
    }
}