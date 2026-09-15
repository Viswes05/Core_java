package lambda;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
class fileve
{
	int x;
	public fileve(int x)
	{
		super();
		this.x=x;
	}
}
public class Filtereve {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n value: ");
		n=s.nextInt();
		List<fileve> list=new ArrayList<fileve>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Number: ");
			int x=s.nextInt();
			list.add(new fileve(x));
		}
		Stream<fileve> filtered_evennum=list.stream().filter(p->p.x%2==0);
		filtered_evennum.forEach(fileve -> System.out.println(fileve.x));
	}

}
