import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(scanner, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SSN: " + ssn);

        String mNumber = SafeInput.getRegExString(scanner, "Enter your UC Student M number", "^(M|m)\\d{5}$");
        System.out.println("Your M number: " + mNumber);

        String menuChoice = SafeInput.getRegExString(scanner, "Enter a menu choice (O, S, V, or Q)",
                "^[OoSsVvQq]$");
        System.out.println("Your menu choice: " + menuChoice);
    }
}
