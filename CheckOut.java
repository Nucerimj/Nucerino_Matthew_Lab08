import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCost = 0.0;

        do {

            double itemPrice = SafeInput.getRangedDouble(scanner, "Enter the price of the item", 0.5, 10.0);


            totalCost += itemPrice;


        } while (SafeInput.getYNConfirm(scanner, "Do you have more items to input?"));


        System.out.printf("Total cost: $%.2f%n", totalCost);
    }
}
