package interfaze;
import java.util.Scanner;
import java.util.function.Predicate;
public class LOgin {

	public static void main(String[] args) {
		String x,y;
		Scanner s=new Scanner(System.in);
		Predicate<String> user=a->a.equals("admin");
		Predicate<String> password=a->a.equals("123");
		System.out.println("Enter the username: ");
		x=s.next();
		System.out.println("Enter the password: ");
		y=s.next();
		if(user.test(x)&&password.test(y))
		{
			System.out.println("Login succesfully");
		}
		else
		{
			System.out.println("User name or password incorrect ");
		}
	}

}
