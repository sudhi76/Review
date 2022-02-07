package evenorodd;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		// If remainder is zero then this number is even
		if (num % 2 == 0) {
			System.out.println("Number is even");
		}
		
		else {
		// If remainder is not zero then this number is odd
			System.out.println("number is odd");
		}

	}

}
