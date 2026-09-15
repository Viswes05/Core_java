package exceptionhand;

public class Illegalecp {
	
	public static void print(int a,int b)
	{
		int x=a+b;
		System.out.println("Addition :"+x);
	}
	public static void main(String[] args) {
		int n1=7;
		int n2=-1;
		if(n1>=0 && n2>=0)
		{
			Illegalecp.print(n1,n2);
		}
		else
		{
			throw new IllegalStateException("Not positive Integer");
		}
	}

}
