package interfaze;
import java.util.Scanner;
import java.util.function.Function;
public class Interfun {

	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int x=m.nextInt();
		Function<Integer,String>s=t->t*10+" Value";
		System.out.println(s.apply(x));
	}

}
