import java.util.Scanner;

class OddEven {
	public static void main(String[] args) {
		int x;
		System.out.print("Enter the value to check the integer value ");
		Scanner in =new Scanner(System.in);
		x=in.nextInt();
		if(x%2==0)
		System.out.println("the number is even");
		else 
		System.out.println("the number is odd");
	}
}