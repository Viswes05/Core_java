package loops;
import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
		char m;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any character: ");
		m=s.next().charAt(0);
		if ((m>='a' && m<='z') || (m>='A' && m<='Z'))
		{
			System.out.println("it is alphabet");
		}
		else if (m>='0' && m<='9')
		{
			System.out.println("it is Digit");
		}
		else
		{
			System.out.println("Both are not digits and alphabets");
		}
		s.close();

	}

}
