import java.util.Scanner;

public class 4 {
    public static void main(String[] args) {
        try {
            String value = getUserInput();
            System.out.println("You entered: " + value);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static String getUserInput() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String userInput = scanner.nextLine().trim();
        if (userInput.isEmpty()) {
            throw new Exception("Empty lines cannot be entered.");
        }
        return userInput;
    }
}
