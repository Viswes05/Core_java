package whileloops;
import java.util.Scanner;
public class Dowhile4 {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n numbers: ");
		n=s.nextInt();
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=n);
		s.close();
	}

}
