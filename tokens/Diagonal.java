package tokens;
import java.util.Scanner;
public class Diagonal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("Value of a: ");
		a=s.nextInt();
		System.out.println("Value of b: ");
		b=s.nextInt();
		float result=a*b/2;
		System.out.println("Diagonal calculation: "+result);
		s.close();
		

	}

}
