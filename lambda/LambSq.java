package lambda;
interface sqvalue
{
	int square(int a);
}
public class LambSq {

	public static void main(String[] args) {
		sqvalue ad2=(int a)->{
			return (a*2);
		};
		System.out.println(ad2.square(5));
		System.out.println(ad2.square(8));
	}

}
