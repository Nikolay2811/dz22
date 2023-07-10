import java.util.Scanner;

public class FractionalNumberInput {
    public static float getFractionalNumber() {
        Scanner scanner = new Scanner(System.in);
        float number = 0.0f;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Enter a fractional number: ");

            if (scanner.hasNextFloat()) {
                number = scanner.nextFloat();
                isValidInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid fractional number.");
                scanner.next(); 
            }
        }

        return number;
    }

    public static void main(String[] args) {
        float input = getFractionalNumber();
        System.out.println("Entered number: " + input);
    }
}
