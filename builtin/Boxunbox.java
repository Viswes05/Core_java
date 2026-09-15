package builtin;

public class Boxunbox {

	public static void main(String[] args) {
		int a=300;
		long b=500;
		float c=5.0F;
		double d=77.0D;
		char e='v';
		Integer s=a;
		Long t=b;
		Float x=c;
		System.out.println("Autobox Conversion "+s+" "+t+" "+x+" ");
		int w=s;
		System.out.println("Ubox Conversion: "+w);
		
	}

}
