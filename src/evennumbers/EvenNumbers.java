package evennumbers;
import java.util.Scanner;
public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer: ");
		int num = sc.nextInt();
		sc.close();
		if(num%2==0) {
			System.out.println(num +" is an even number ");
		}
		else {
			System.out.println(num +" is not an even number ");
		}
	}
}
