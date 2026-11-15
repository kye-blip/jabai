
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] prices = new double[10];
        double[] discountedPrices = new double[10];

        double totalDiscount = 0;
        double highestDiscountedPrice = 0;

        // Input prices
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter price of product " + (i + 1) + ": ");
            prices[i] = input.nextDouble();

            while (prices[i] <= 0) {
                System.out.print("Enter a price greater than zero: ");
                prices[i] = input.nextDouble();
            }

            // Apply discount
            if (prices[i] >= 1000) {
                discountedPrices[i] = prices[i] * 0.90;
            } else {
                discountedPrices[i] = prices[i] * 0.95;
            }

            totalDiscount += prices[i] - discountedPrices[i];

            if (discountedPrices[i] > highestDiscountedPrice) {
                highestDiscountedPrice = discountedPrices[i];
            }
        }

        // Display discounted prices
        System.out.println("\nDiscounted Prices:");

        for (int i = 0; i < 10; i++) {
            System.out.printf("Product %d: PHP %.2f%n",
                    (i + 1), discountedPrices[i]);
        }

        System.out.printf("\nTotal Discount Given: PHP %.2f%n", totalDiscount);
        System.out.printf("Highest Discounted Price: PHP %.2f%n",
                highestDiscountedPrice);

        input.close();
    }
}
