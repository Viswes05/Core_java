package tokens;
import java.util.Scanner;
public class Conversion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value in  celsius: ");
		a=s.nextInt();
		b=(9/5)*a+32;
		System.out.println("Faranheit value is: "+b);
		s.close();

	}

}
