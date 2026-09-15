package loops;
import java.util.*;
public class Digi {

	public static void main(String[] args) {
		char m;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any Char or digit : ");
		m=s.next().charAt(0);
		if(m>='0' == m<='9')
		{
			System.out.println("it is digi");
		}
		else
		{
			System.out.println("it is not digi");
		}
		s.close();
		

	}

}
