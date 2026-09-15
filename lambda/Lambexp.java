package lambda;
import java.util.Scanner;
interface Expvalue
{
	int setValue(int f,int g,int h,int j);
}
public class Lambexp {

	public static void main(String[] args) {
		Expvalue ad2=(int f,int g,int h,int j)->{
			return (f+g-h*j);
		};
		System.out.println("Result of the Expression : "+ad2.setValue(1,2,3,4));
	}

}
