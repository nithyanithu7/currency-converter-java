import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Currency Converter -----");
        System.out.println("Available Currencies:");
        System.out.println("1. INR");
        System.out.println("2. USD");
        System.out.println("3. EUR");

        System.out.print("Select base currency (1-3): ");
        int base = sc.nextInt();

        System.out.print("Select target currency (1-3): ");
        int target = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double convertedAmount = 0;

        // Predefined exchange rates
        if (base == 1 && target == 2) {           // INR to USD
            convertedAmount = amount * 0.012;
        } else if (base == 1 && target == 3) {    // INR to EUR
            convertedAmount = amount * 0.011;
        } else if (base == 2 && target == 1) {    // USD to INR
            convertedAmount = amount * 83.0;
        } else if (base == 2 && target == 3) {    // USD to EUR
            convertedAmount = amount * 0.92;
        } else if (base == 3 && target == 1) {    // EUR to INR
            convertedAmount = amount * 90.0;
        } else if (base == 3 && target == 2) {    // EUR to USD
            convertedAmount = amount * 1.08;
        } else if (base == target) {
            convertedAmount = amount;
        } else {
            System.out.println("Invalid currency selection!");
            sc.close();
            return;
        }

        System.out.println("Converted Amount: " + convertedAmount);

        sc.close();
    }
}
