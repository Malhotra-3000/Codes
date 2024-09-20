import java.util.Scanner;

class MultiFunction { // Class names should start with an uppercase letter
    public static void main(String[] args) {
        System.out.println("Hello MR.");
        System.out.println("What can I do for you?");
        Scanner scanner = new Scanner(System.in); // 'System' should be capitalized
        int choice;

        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Say hello to me!");
            System.out.println("2. Greet me");
            System.out.println("3. Odd or even number");
            System.out.println("4. Adding two integers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); // Missing line to get the user input

            switch (choice) { // 'switch' should be lowercase
                case 1:
                    System.out.println("Hello!");
                    break; // Added break statement to avoid fall-through
                case 2:
                    System.out.println("Greetings!");
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    int num = scanner.nextInt();
                    if (num % 2 == 0) {
                        System.out.println(num + " is even.");
                    } else {
                        System.out.println(num + " is odd.");
                    }
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int num2 = scanner.nextInt();
                    System.out.println("The sum is: " + (num1 + num2));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5); // Fixed the loop condition

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
