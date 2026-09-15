package oops;
import java.util.Scanner;
class Pconst2
{
	int m=30,s=50,r;
	Pconst2()
	{
		m=100;
		s=200;
		System.out.println("Valuse are "+m+" "+s);
	}
	Pconst2(int x,int y)
	{
		m=x;
		s=y;
		System.out.println("Valuse are "+m+" "+s);
	}
	Pconst2(int x,int y,int z)
	{
		m=x;
		s=y;
		r=z;
		System.out.println("Valuse are "+m+" "+s+" "+r);
	}
}
public class Pcon2 {

	public static void main(String[] args) {
		Pconst2 n1=new Pconst2();
		Pconst2 n2=new Pconst2(1000,2000);
		Pconst2 n3=new Pconst2(20,400,5000);

	}

}
