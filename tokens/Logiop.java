package tokens;

import java.util.Scanner;

public class Logiop {

	public static void main(String[] args) {
		int x,y,z;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		x=s.nextInt();
		System.out.println("Enter the value of y: ");
		y=s.nextInt();
		System.out.println("Enter the value of z: ");
		z=s.nextInt();
		System.out.println((x<y)&&(x<z));//if both are true 
		System.out.println((x!=y)||(x==z));//if one is true 
		System.out.println((!(x<y)));//true=false
		s.close();

	}

}
