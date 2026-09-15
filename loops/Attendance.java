package loops;
import java.util.*;
public class Attendance {

	public static void main(String[] args) {
		int classes,attend;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter total number of classes: ");
		classes =s.nextInt();
		System.out.println("Enter attended Classes: ");
		attend=s.nextInt();
		float attendance=(attend*100)/classes;
		if(attendance>70.0)
		{
			System.out.print("You are allowed the exam: ");
		}
		else
		{
			System.out.print("You are not allowed the exam: ");
		}
		s.close();
			

	}

}
