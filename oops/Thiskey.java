package oops;
import java.util.Scanner;
class Tw
{
	int idno;
	String name;
	int mark;
	Tw(int idno,String name,int mark)
	{
		idno=idno;
		name=name;
		mark=mark;
	}
	void display()
	{
		System.out.println("Roll no is "+idno+" Name is "+name+" Company is "+mark);
	}
}
public class Thiskey {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Roll no: ");
		int a=s.nextInt();
		System.out.println("Enter the name: ");
		String b=s.next();
		System.out.println("Enter the Mark: ");
		int c=s.nextInt();
		Tw n=new Tw(a,b,c);
		n.display();
	}

}
