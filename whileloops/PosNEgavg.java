package whileloops;

import java.util.Scanner;

public class PosNEgavg {

	public static void main(String[] args) {
		int a,xsum=0,ysum=0,xcount=0,ycount=0;
		float xavg,yavg;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
		a=s.nextInt();
		while(a!=1000)
		{
			if(a>0)
			{
				xsum=xsum+a;
				xcount++;
			}
			else
			{
				ysum=ysum-a;
				ycount++;
			}
			System.out.println("Enter the value: ");
			a=s.nextInt();
		}
		xavg=xsum/xcount;
		yavg=ysum/ycount;
		System.out.println("Positive sum is "+xavg);
		System.out.println("Negative sum is "+-(yavg));
		s.close();

	}

}
