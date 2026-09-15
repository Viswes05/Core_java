package loops;
import java.util.Scanner;
public class Grading {

	public static void main(String[] args) {
		int mark;
		String name;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name: ");
		name=s.nextLine();
		System.out.println("Enter your mark: ");
		mark=s.nextInt();
		if(mark>=80 && mark<=100)
		{
			System.out.println("Your name is "+name+" Your grade is I");
		}
		else if(mark>=50 && mark<80)
		{
			System.out.println("Your name is "+name+" Your grade is II");
		}
		else if(mark>=35 && mark<50)
		{
			System.out.println("Your name is "+name+" Your grade is III");
		}
		else if(mark<35)
		{
			System.out.println("Your name is "+name+" You are Fail");
		}
		else
		{
			System.out.println("Wrong mark");
		}
		s.close();

	}

}
