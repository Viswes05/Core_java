package tokens;
import java.util.Scanner;
public class Ebbill {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,d;
		System.out.println("Current reading: ");
		a=s.nextInt();
		System.out.println("Previous reading :");
		b=s.nextInt();
		d=a-b;
		int unit=8;
		float total1=d*unit;
		System.out.println("total using unit :"+d);
		System.out.println("Total using price: "+total1);
		s.close();
	}

}
