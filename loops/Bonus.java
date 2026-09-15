package loops;
import java.util.*;
public class Bonus {

	public static void main(String[] args) {
		int salary,exp;
		double bonus=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your salary: ");
		salary=s.nextInt();
		System.out.println("Enter your experience: ");
		exp=s.nextInt();
		if (exp>6)
		{
			bonus=0.1*salary;
			System.out.println("your bonus is ");
			System.out.println(bonus);
		}
		else
		{
			System.out.println("No bonus");
		}
		s.close();

	}

}
