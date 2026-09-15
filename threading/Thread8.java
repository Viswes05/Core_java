package threading;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread A ="+i);
		}
		System.out.println("End of the Thread A: ");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=1;j<=7;j++)
		{
			System.out.println("Thread B ="+j);
		}
		System.out.println("End of the Thread B: ");
	}
}
class C extends Thread
{
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			System.out.println("Thread C ="+k);
		}
		System.out.println("End of the Thread C: ");
	}
}
public class Thread8 {

	public static void main(String[] args) {
		A a= new A();
		B b= new B();
		a.setPriority(Thread.MAX_PRIORITY-2);
		b.setPriority(Thread.MIN_PRIORITY+2);
		a.start();
		b.start();
		System.out.println("End of the Main Thread :");

	}

}
