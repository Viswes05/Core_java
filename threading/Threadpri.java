package threading;

public class Threadpri extends Thread {
	public void run()
	{
		System.out.println("Priority is: "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		Threadpri t1 =new Threadpri();
		t1.setPriority(MIN_PRIORITY);
		t1.run();;
		

	}

}
