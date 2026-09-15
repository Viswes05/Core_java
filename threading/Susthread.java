package threading;

public class Susthread extends Thread{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try
			{
				sleep(500);
				System.out.println(Thread.currentThread().getName());
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Susthread t1=new Susthread();
		Susthread t2=new Susthread();
		Susthread t3=new Susthread();
		t1.start();
		t2.start();
		t2.suspend();
		t3.start(); 


	}

}
