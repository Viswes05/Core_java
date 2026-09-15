package interfaze;
import java.util.Scanner;
import java.util.function.Consumer;
class base1
{
	int age;
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
}
public class Consum extends base1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Age: ");
		int x=s.nextInt();
		base1 b= new base1();
		Consumer<base1> n=t->t.setAge(x);
		n.accept(b);
		System.out.println(b.getAge());
	}

}
