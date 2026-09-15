package oops;
import java.util.Scanner;
class Tword2
{
	int idno;
	String name;
	int mark;
	Tword2(int idno,String name)
	{
		this.idno=idno;
		this.name=name;
	}
	Tword2(int idno,String name,int mark)
	{
		this(idno,name);
		this.mark=mark;
	}
	void display()
	{
		System.out.println("Roll no is "+idno+" Name is "+name+" Company is "+mark);
	}
}
public class Thiskeyword {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Roll no: ");
		int a=s.nextInt();
		System.out.println("Enter the Name: ");
		String b=s.next();
		Tword2 n1=new Tword2(a,b);
		n1.display();
		System.out.println("Enter the Roll no: ");
		int q=s.nextInt();
		System.out.println("Enter the Name: ");
		String w=s.next();
		System.out.println("Enter the Mark: ");
		int e=s.nextInt();
		Tword2 n2=new Tword2(q,w,e);
		n2.display();
		
	}

}
