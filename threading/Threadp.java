package threading;

class Thread2 extends Thread{
	public void run()
	{
		try
		{
			System.out.println("Thread"+Thread.currentThread().getId()+"Working");
		}
		catch(Exception e)
		{
			System.out.println("Exception is Caught");
		}
	}
}
public class Threadp
{
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			Thread2 s=new Thread2();
			s.start();
		}
	}

}
