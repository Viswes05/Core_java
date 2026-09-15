package loops;
import java.util.*;
public class Costofqual {

	public static void main(String[] args) {
		int quantity,total;
		double discount,pay;
		int price=150;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of quantity: ");
		quantity=s.nextInt();
		total=price*quantity;
		if(total>1000)
		{
			discount=0.1*total;
			pay=total-discount;
			System.out.println("Total paym amount is ");
			System.out.println(pay);
		}
		else
		{
			System.out.println("Total pay amount is ");
			System.out.print(total);
		}
		s.close();
		

	}

}
