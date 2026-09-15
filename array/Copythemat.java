package array;
import java.util.Scanner;
import java.util.Arrays;
public class Copythemat {

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
		int file[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				file[i][j]=b[i][j];
			}
		}
		System.out.println("Current matrix is "+Arrays.deepToString(b));
		System.out.println("Copy of the matrix is "+Arrays.deepToString(file));
		s.close();
	}

}
