import java.util.Scanner;
class Untitled {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				int number;
				String response;
		
				do {
					System.out.print("Please enter a number: ");
					number = scanner.nextInt();
					
					if (number % 2 == 0) {
						System.out.println("SIR,You have chosen even.");
					} else {
						System.out.println("SIR,You have chosen odd.");
					}
					
					System.out.print("Do you want to enter another number? (y/n): ");
					scanner.nextLine();  // consume the newline left by nextInt()
					response = scanner.nextLine();
				} while (response.equalsIgnoreCase("y"));
		
				scanner.close();
			}
			{
	}
}