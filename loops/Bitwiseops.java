package loops;

import java.util.Scanner;

public class Bitwiseops {

	public static void main(String[] args) {
		int a,b,c,opt;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the First Value: ");
		a=s.nextInt();
		System.out.println("Enter the second value: ");
		b=s.nextInt();
		System.out.println("Enter the option 1 or 2 or 3 or 4 ");
		opt=s.nextInt();
		switch(opt)
		{
		case 1:
			c=a&b;
			System.out.println("Bitwise AND "+c);
			break;
		case 2:
			c=a|b;
			System.out.println("Bitwise OR "+c);
			break;
		case 3:
			c=~a;
			System.out.println("Bitwise NOT "+c);
			break;
		case 4:
			c=a^b;
			System.out.println("Bitwise XOR "+c);
			break;
		default :
			System.out.println("Error");
			break;
			
		}
		s.close();
	}

}
