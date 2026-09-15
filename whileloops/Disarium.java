package whileloops;
import java.util.Scanner;
public class Disarium {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,d,count=0,t;
		System.out.println("Enter the number: ");
		a=s.nextInt();
		d=0;
		b=a;
		t=a;
		while(a!=0)
		{
			a=a/10;
			count=count+1;
		}
		while(t!=0)
		{
			int temp=1;
			int r=t%10;
			for(int p=0;p<count;p++)
			{
				temp=temp*r;
			}
			d=d+temp;
			t=t/10;
			count--;
		}
		if (b==d)
		{
			System.out.println("Disarium Number");
		}
		else
		{
			System.out.println("Not Disarium number");
		}
		s.close();

	}

}
