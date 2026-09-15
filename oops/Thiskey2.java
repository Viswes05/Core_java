package oops;
import java.util.Scanner;
class Tw2
{
	int idno;
	String name;
	int mark;
	Tw2(int idno,String name,int mark)
	{
		this.idno=idno;
		this.name=name;
		this.mark=mark;
	}
	void display()
	{
		System.out.println("Roll no is "+idno+" Name is "+name+" Company is "+mark);
	}
}
public class Thiskey2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Roll no: ");
		int a=s.nextInt();
		System.out.println("Enter the name: ");
		String b=s.next();
		System.out.println("Enter the Mark: ");
		int c=s.nextInt();
		Tw2 n=new Tw2(a,b,c);
		n.display();
	}

}
