package interfaze;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
public class Custom {

	public static void main(String[] args) {
		List<Product1> pro=new ArrayList<Product1>();
		Product1 p1=new Product1();
		Product1 p2=new Product1();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the product name: ");
		String Pname=s.next();
		System.out.println("Enter the Vendor name: ");
		String Vname=s.next();
		System.out.println("Enter the Price : ");
		int amount=s.nextInt();
		p1.setPname(Pname);
		p1.setVname(Vname);
		p1.setAmount(amount);
		System.out.println("Enter the product name: ");
		String Pname1=s.next();
		System.out.println("Enter the product name: ");
		String Vname1=s.next();
		System.out.println("Enter the Price : ");
		int amount1=s.nextInt();
		p1.setPname(Pname1);
		p1.setVname(Vname1);
		p1.setAmount(amount1);
		pro.add(p1);
		pro.add(p2);
		find(pro,m->m.getAmount()>20000);
		find(pro,m->m.getAmount()==7000);
	}
	private static void find(List<Product1> pro,Predicate<Product1> propredicate)
	{
		for(Product1 p:pro)
		{
			if(propredicate.equals(p))
			{
				System.out.println(p.getPname());
			}
		}
	}

}
