package exceptionhand;

public class Userdef extends Exception{

	private static int Pid[]= {1,2,3,4,5};
	private static String Pname[]= {"Mobile","Laptop","Computer","Tablet","Smart Watch"};
	private static double Price[]= {20000.00,32000.00,25700.00,6000.00,7000.00};
	Userdef()
	{
		
	}
	Userdef(String str)
	{
		super();
	}
	public static void main(String[] args) {
		try
		{
			System.out.println("Pno"+"\t"+"Product name"+"\t"+"Price");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(Pid[i]+"\t"+Price[i]+"\t\t"+Price[i]);
			if(Price[i]<4000)
			{
				Userdef k=new Userdef("Price is below 4000");
				throw k;
			}
		}
	}
		catch(Userdef e)
		{
			e.printStackTrace();
		}
	}
}

