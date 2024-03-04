import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int favoriteInt = SafeInput.getInt(scanner, "Enter your favorite integer");
        System.out.println("Your favorite integer: " + favoriteInt);


        double favoriteDouble = SafeInput.getDouble(scanner, "Enter your favorite double");
        System.out.println("Your favorite double: " + favoriteDouble);
    }
}
