package threading;

public class Thread3 implements Runnable {
	public void run()
	{
		System.out.println("Thread Created");
	}
	public static void main(String[] args) {
		Thread3 t=new Thread3();
//		Thread ob=new Thread(t);
		t.run();
		System.out.println("Thread Completed");
	}

}
