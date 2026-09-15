package tokens;
import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
		int x,y,z;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		x=s.nextInt();
		System.out.println("Enter the value of y: ");
		y=s.nextInt();
		z= x-y;
		System.out.print(z);
		s.close();
	}

}
