package loops;
import java.util.Scanner;
public class Timecondition {

	public static void main(String[] args) {
		String name,degree;
		int age;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your name: ");
		name=s.nextLine();
		System.out.println("Enter your Qualification: ");
		degree=s.nextLine();
		System.out.println("Enter your age: ");
		age=s.nextInt();
		if (degree.equals("ug"))
		{
			if(age>=20 && age<=30)
			{
				System.out.println("Hi "+name+"Your Working time 9 a.m to 7 p.m");
			}
		}
		else if(degree.equals("pg"))
		{
			if(age>=20 && age<=30)
			{
				System.out.println("Hi "+name+"Your Working time 8 a.m to 8 p.m");
			}
		}
		else
		{
			System.out.println("Hi "+name+"Not Eligible");
		}
		s.close();
		
	}

}
