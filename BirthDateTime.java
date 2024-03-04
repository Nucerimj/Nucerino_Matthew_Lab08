import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birthYear = SafeInput.getRangedInt(scanner, "Enter your birth year", 1950, 2015);


        int birthMonth = SafeInput.getRangedInt(scanner, "Enter your birth month", 1, 12);


        int maxDaysInMonth = switch (birthMonth) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };


        int birthDay = SafeInput.getRangedInt(scanner, "Enter your birth day", 1, maxDaysInMonth);


        int birthHour = SafeInput.getRangedInt(scanner, "Enter the hour of your birth", 1, 24);


        int birthMinute = SafeInput.getRangedInt(scanner, "Enter the minute of your birth", 1, 59);

        System.out.println("Your birth date and time: " +
                birthYear + "-" + birthMonth + "-" + birthDay + " " + birthHour + ":" + birthMinute);
    }
}
