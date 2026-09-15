package loops;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		String name;
		int mark,percent;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name: ");
		name=s.nextLine();
		System.out.println("Enter your mark: ");
		mark=s.nextInt();
		System.out.println("Enter your percentage: ");
		percent=s.nextInt();
		if(percent>75)
		{
		
			if(mark>80)
			{
				System.out.println("Hi "+name+"Your are selected");
			}
			else
			{
				System.out.println("Hi "+name+"Your are not selected");
			}
		}
		else
		{
			System.out.println("Hi "+name+"Your are not selected");
		}
		s.close();
	

	}

}
