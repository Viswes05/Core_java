package threading;

public class Thread5 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("Current thread is ="+ t);
		t.setName("SysTech");
		System.out.println("After Changing Name is ="+ t);
	}

}
