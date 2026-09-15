package threading;

public class Setthread extends Thread {
	public void run()
	{
		System.out.println("Running");
	}

	public static void main(String[] args) {
		Setthread t1=new Setthread();
		Setthread t2=new Setthread();
		t1.setPriority(4);
		t2.setPriority(7);
		System.out.println("Priority of Thread t1 is:  "+t1.getPriority());
		System.out.println("Priority of Thread t2 is:  "+t2.getPriority());
		t1.start();




	}

}
