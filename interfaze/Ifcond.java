package interfaze;
import java.util.Scanner;
import java.util.function.Predicate;
public class Ifcond {

	public static void main(String[] args) {
		int x;
		Scanner s=new Scanner(System.in);
		Predicate<Integer> data=a->a%2==0;
		System.out.println("Enter the x: ");
		x=s.nextInt();
		if(data.test(x))
		{
			System.out.println(x+ "Even number");
		}
		else
		{
			System.out.println(x+ "Odd number");
		}
	}

}
