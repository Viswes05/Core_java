package loops;
import java.util.*;
public class Sqaurerect {

	public static void main(String[] args) {

				int length,breadth;
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the first value : ");
				length=s.nextInt();
				System.out.println("Enter the second value : ");
				breadth=s.nextInt();
				if(length==breadth)
				{
					System.out.println("it is square");
				}
				else
				{
					System.out.println("it is not square");
				}
				s.close();
				

			


	}

}
