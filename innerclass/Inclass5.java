package innerclass;
import java.util.Scanner;

class Ari  
{
	public void add()
	{
		int x,y,z;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter X: ");
		x=s.nextInt();
		System.out.println("Enter Y: ");
		y=s.nextInt();;
		z=x+y;
		System.out.println("Addition value is : "+z);
	}
	static class subtract
	{
		public void sub()
		{
			int x,y,z ;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter X: ");
			x=s.nextInt();
			System.out.println("Enter Y: ");
			y=s.nextInt();;
			z=x-y;
			System.out.println("Addition value is : "+z);
		}
	}
}
public class Inclass5 extends Ari
{
	public static void main(String[] args) {
		Ari.subtract s=new Ari.subtract();
		s.sub();
	}

}
