package threading;

public class Resthread extends Thread {
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try 
			{
				Thread.sleep(500);
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
		Resthread t1=new Resthread();
		Resthread t2=new Resthread();
		Resthread t3=new Resthread();
		t1.start();
		t2.start();
		t2.suspend();
		t3.start(); 
		t2.resume();
	}

}
