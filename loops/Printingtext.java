package loops;

import java.util.Scanner;

public class Printingtext {

	public static void main(String[] args) {
		int opt;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the any one opition: 1...2...3...4");
		opt=s.nextInt();
		switch(opt)
		{
		case 1:
			System.out.println(" Welcome");
			break;
		case 2:
			System.out.println("Hai ");
			break;
		case 3:
			System.out.println("Hai come");
			break;
		case 4:
			System.out.println("Hai ");
			break;
		default:
			System.out.println("Error");
			break;
			
		}
		s.close();
	}

}
