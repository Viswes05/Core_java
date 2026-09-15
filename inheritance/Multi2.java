package inheritance;
class base8
{
	int x=100;
	int y=300;
	int z=0;
	public void add()
	{
		z=x+y;
		System.out.println("Sum of Two Numbers: "+z);
	}
}
class base9 extends base8
{
	int k=100;
	int s=300;
	int m=0;
	public void sub()
	{
		m=k-s;
		System.out.println("Sub of Two Numbers: "+m);
	}
}
public class Multi2 extends base9 
{

	public static void main(String[] args) 
	{
		Multi2 d=new Multi2();
		d.add();
		d.sub();
	}

}

