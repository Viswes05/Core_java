package exceptionhand;
import java.io.IOException;
import java.util.Scanner;
public class IOexp {

	public static void main(String[] args) {
		Scanner scan=new Scanner("");
		System.out.println(""+ scan.nextLine());
		scan.ioException();
		scan.close();
	}

}
