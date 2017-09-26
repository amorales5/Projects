import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner flerb = new Scanner(System.in);

        double gallons = 0.0;
        int mpg = 0;
        double percentage = 0.0;
        double rawRange = 0.0;


        System.out.println("Enter car's MPG rating: ");
        mpg = flerb.nextInt();

        if (mpg <= 0) {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            System.exit(0);
        }

        System.out.println("Enter car's tank capacity: ");
        gallons = flerb.nextDouble();

        if (gallons <= 0.0) {
            System.out.println("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            System.exit(0);
        }

        System.out.println("Enter percentage of gas tank filled: ");
        percentage = flerb.nextDouble();

        if ((percentage <= 0.0) || (percentage >= 100.0)) {
            System.out.println("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
            System.exit(0);
        }

        rawRange =  (double)mpg * gallons * (percentage * 0.01);

        if (rawRange < 25) {
            System.out.println("Attention! Your current estimated range is running low: " + Math.round(rawRange) + " miles left!!!");
        }

        if (rawRange >= 25){
            System.out.println("Keep driving! Your current estimated range is: " + Math.round(rawRange) + " miles!");
        }
    }
}