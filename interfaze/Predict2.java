package interfaze;
import java.util.Scanner;
import java.util.function.Predicate;
public class Predict2 {

	public static void main(String[] args) {
		int x;
		Scanner s=new Scanner(System.in);
		Predicate<Integer> data=a->a%2==0;
		System.out.println("Enter the x: ");
		x=s.nextInt();
		System.out.println(data.test(x));
	}

}
