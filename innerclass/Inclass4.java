package innerclass;

public class Inclass4 {
	static int data=30;
	static class Inner 
	{
		void msg()
		{
			System.out.println("Data is "+data);
		}
	}

	public static void main(String[] args) {
		Inclass4.Inner n=new Inclass4.Inner();
		n.msg();
	}

}
