package interfaze;
import java.util.function.Supplier;
public class Supplier1{

	public static void main(String[] args) {
		Supplier<Double>s=()->Math.random();
		System.out.println(s.get());
	}

}
