package array;
import java.util.Scanner;
import java.util.Arrays;
public class Stringarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number: ");
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
		System.out.println(Arrays.deepToString(b));
		s.close();
	}

}
