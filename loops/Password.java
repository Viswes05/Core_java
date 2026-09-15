package loops;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		String uname;
		int pass;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your username: ");
		uname=s.nextLine();
		System.out.println("Enter your Password: ");
		pass=s.nextInt();
		if(uname.equals("Admin"))
		{
			if(pass==1234)
			{
				System.out.println("Login succesfully");
			}
			else
			{
				System.out.println("Login Failed");
			}
		}
		else
		{
			System.out.println("Username Incorrect !");
		}
		s.close();
		
	}

}
