import java.util.Scanner;

public class ValidPassword {
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
        return true;
    }
}
