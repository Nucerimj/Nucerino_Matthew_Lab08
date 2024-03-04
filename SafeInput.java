import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString;
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.isEmpty());

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int userInt = 0;
        boolean done;
        do {
            System.out.println("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                userInt = pipe.nextInt();
                done = true;
            } else {
                System.out.println("Please enter an int.");
                done = false;
                pipe.nextLine();
            }
        } while (!done);

        return userInt;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double userDouble = 0;
        boolean done;
        do {
            System.out.println("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                userDouble = pipe.nextDouble();
                done = true;
            } else {
                System.out.println("Please enter a double.");
                done = false;
                pipe.nextLine();
            }
        } while (!done);

        return userDouble;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int lo, int hi) {
        int userInt = 0;
        boolean done;
        do {
            System.out.println("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                userInt = pipe.nextInt();
                done = true;
            } else {
                System.out.println("Please enter an int.");
                done = false;
                pipe.nextLine();
            }
            if (userInt >= lo && userInt <= hi && done) {
                System.out.println("You have entered a number " + userInt + " that is in range.");
            } else if (!done) {

            } else {
                done = false;
                System.out.println("Number " + userInt + " is not in range. Please pick a number between " + lo + "-" + hi);
            }
        } while (!done);

        return userInt;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double lo, double hi) {
        double userDouble = 0;
        boolean done;
        do {
            System.out.println("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                userDouble = pipe.nextDouble();
                done = true;
            } else {
                System.out.println("Please enter a double.");
                done = false;
                pipe.nextLine();
            }
            if (userDouble >= lo && userDouble <= hi && done) {
                System.out.println("You have entered a number " + userDouble + " that is in range.");
            } else if (!done) {

            } else {
                done = false;
                System.out.println("Number " + userDouble + " is not in range. Please pick a number between " + lo + "-" + hi);
            }
        } while (!done);

        return userDouble;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean userYN = false;
        String userInt = "";
        boolean done;
        do {
            System.out.println("\n" + prompt + ": ");
            if (pipe.hasNextLine()) {
                userInt = pipe.nextLine();
            } else {
                System.out.println("Please enter a string.");
                pipe.nextLine();
            }
            if (userInt.equalsIgnoreCase("Y")) {
                userYN = true;
                done = true;
            } else if (userInt.equalsIgnoreCase("N")) {
                done = true;
            } else {
                System.out.println("There is an error in your input, please put a Y/N.");
                done = false;
            }
        } while (!done);

        return userYN;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String userString = "";
        boolean done = false;
        boolean done1 = false;
        do {
            do {
                System.out.println("\n" + prompt + ": ");
                if (pipe.hasNextLine()) {
                    userString = pipe.nextLine();
                    done = true;
                } else {
                    System.out.println("Please enter a string.");
                    pipe.nextLine();
                }
            } while (!done);

            Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(userString);
            done = false;

            boolean userEqRegEx = matcher.find();

            if (userEqRegEx) {
                System.out.println(regEx + " pattern was found.");
                done1 = true;
            } else {
                System.out.println("The pattern " + regEx + " was not found.");
            }
        } while (!done1);

        return userString;
    }

    public static String prettyHeader(String msg) {
        int lineLength = 60;
        String formattedMsg = "";
        int msgLength = msg.length();
        int spaceLength = (lineLength - msgLength - 6) / 2;
        StringBuilder space = new StringBuilder();
        StringBuilder starLine = new StringBuilder();

        space.append(" ".repeat(Math.max(0, spaceLength + 1)));

        starLine.append("*".repeat(lineLength + 1));

        formattedMsg += starLine + "\n" + "***" + space + msg + space + "***" + "\n" + starLine;

        return formattedMsg;
    }
}
