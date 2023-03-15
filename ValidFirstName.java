import java.util.Scanner;

public class ValidFirstName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        boolean isValid = validateFirstName(firstName);

        if (isValid) {
            System.out.println("Valid first name");
        } else {
            System.out.println("Invalid first name");
        }
    }

    public static boolean validateFirstName(String firstName) {
        if (firstName.length() < 3) {
            return false;
        }
        char firstChar = firstName.charAt(0);
        if (!Character.isUpperCase(firstChar)) {
            return false;
        }
        return true;
    }
}
