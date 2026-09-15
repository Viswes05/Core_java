package threading;
class Testing extends Thread
{
	public Testing(String x)
	{
		super(x);
	}
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(getName());
		}
	}
}
public class Thread7 {

	public static void main(String[] args) {
		Testing t1=new Testing("Thread 1");
		Testing t2=new Testing("Thread 2");
		t1.start();
		t2.start();
	}

}
