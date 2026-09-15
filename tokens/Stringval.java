package tokens;
import java.util.Scanner;
public class Stringval {

	public static void main(String[] args) {
		String name;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name : ");
		name=s.nextLine();
		System.out.println("Your name is :"+name);
		s.close();

	}

}
