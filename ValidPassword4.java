import java.util.Scanner;

public class ValidPassword4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        boolean isValid = validatePassword(password);

        if (isValid) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }

    public static boolean validatePassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (isSpecialChar(c)) {
                hasSpecialChar = true;
            }
        }
        return hasUpperCase && hasNumber && hasSpecialChar;
    }

    public static boolean isSpecialChar(char c) {
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        return specialChars.contains(String.valueOf(c));
    }
}
