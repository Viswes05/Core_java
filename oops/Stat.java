package oops;
import java.util.Scanner;
class Stat1
{
	int idno;
	String name;
	static String Cname="IBM";
	Stat1(int x, String y)
	{
		idno=x;
		name=y;
	}
	void display()
	{
		System.out.println("Roll no is "+idno+" Name is "+name+" Company is "+Cname);
	}
}
public class Stat {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(int k=0;k<2;k++)
		{
			System.out.println("Enter the Roll no: ");
			int a=s.nextInt();
			System.out.println("Enter the Name: ");
			String b=s.next();
			Stat1 n=new Stat1 (a,b);
			n.display();
		}
	}

}
