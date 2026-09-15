package array;

import java.util.Scanner;
import java.util.Arrays;
public class Copy2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number :");
		int n=s.nextInt();
		int b[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter the value: ");
				b[i][j]=s.nextInt();
			}
		}
		int x[][]=new int[n][n];
		for(int i=0;i<b.length;i++)
		{
			System.arraycopy(b[i],0,x[i],0,x[i].length);
		}
		System.out.println(Arrays.deepToString(x));
		s.close();
	}

}
