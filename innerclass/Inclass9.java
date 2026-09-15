package innerclass;
class Data
{
	int x=20;
	void display()
	{
		System.out.println("The value is "+x);
	}
class Data2
{
	void display2()
	{
		System.out.println("Welcome");
	}
}
	
}
public class Inclass9 {

	public static void main(String[] args) 
	{
		Data s=new Data();
		s.display();
		Data.Data2 n=s.new Data2();
		n.display2();
	}

}
