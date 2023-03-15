import java.util.Scanner;

public class ValidLastName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        boolean isValid = validateLastName(lastName);

        if (isValid) {
            System.out.println("Valid last name");
        } else {
            System.out.println("Invalid last name");
        }
    }

    public static boolean validateLastName(String lastName) {
        if (lastName.length() < 3) {
            return false;
        }
        char firstChar = lastName.charAt(0);
        if (!Character.isUpperCase(firstChar)) {
            return false;
        }
        return true;
    }
}
