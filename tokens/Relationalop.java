package tokens;
import java.util.Scanner;
public class Relationalop {

	public static void main(String[] args) {
		int x,y;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		x=s.nextInt();
		System.out.print("Enter the value of y: ");
		y=s.nextInt();
		System.out.println("Result: "+(x==y));
		System.out.println("Result: "+(x!=y));
		System.out.println("Result: "+(x<y));
		System.out.println("Result: "+(x>y));
		System.out.println("Result: "+(x<=y));
		System.out.println("Result: "+(x>=y));
		s.close();
		
	}

}
