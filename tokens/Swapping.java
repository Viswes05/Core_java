package tokens;
import java.util.Scanner;
public class Swapping {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,d;
		System.out.println("Enter the first value: ");
		a=s.nextInt();
		System.out.println("Enter the second value: ");
		b=s.nextInt();
		d=a;
		a=b;
		b=d;
		System.out.println("Swapping result is: ");
		System.out.println("A is "+a+" B is "+b);
		s.close();

	}

}
