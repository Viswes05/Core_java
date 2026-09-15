package loops;
import java.util.*;
public class Lossandprofit {

	public static void main(String[] args) {
		
		int actual,sale;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the actual amount: ");
		actual =s.nextInt();
		System.out.println("Enter the sale amount: ");
		sale =s.nextInt();
		if(sale>actual)
		{
			System.out.println("Profit");
		}
		else
		{
			System.out.println("Loss");
		}
		s.close();
		
		
	}

}
