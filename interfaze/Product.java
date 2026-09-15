package interfaze;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product {

	public static void main(String[] args) {
		List<Product1> pro=new ArrayList<Product1>();
		Product1 p1=new Product1();
		Product1 p2=new Product1();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Product name: ");
		String pname=s.next();
		System.out.println("Enter the Vendor name: ");
		String vname=s.next();
		System.out.println("Enter the price: ");
		int amount =s.nextInt();
		System.out.println("Enter the Year: ");
		int year1=s.nextInt();
		p1.setPname(pname);
		p1.setVname(vname);
		p1.setAmount(amount);
		p1.setYear(year1);
		System.out.println("Enter the Product name: ");
		String pname1=s.next();
		System.out.println("Enter the Vendor name: ");
		String vname1=s.next();
		System.out.println("Enter the price: ");
		int amount1 =s.nextInt();
		System.out.println("Enter the Year: ");
		int year2=s.nextInt();
		p2.setPname(pname1);
		p2.setVname(vname1);
		p2.setAmount(amount1);
		p2.setYear(year2);
		pro.add(p1);
		pro.add(p2);
		find(pro);
		findvendor(pro);

	}
	private static void find(List<Product1> pro)
	{
		System.out.println("Above 20000 price Product");
		for(Product1 p:pro)
		{
			if(p.getAmount()>20000)
			{
				System.out.println(p.getAmount());
			}
		}
	}
	private static void findvendor(List<Product1>pro)
	{
		System.out.println("2021 year Product");
		for(Product1 p:pro)
		{
			if(p.getYear()==2021)
			{
				System.out.println(p.getPname());
			}
		}
	}
}
