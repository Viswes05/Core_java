package globalvariables;

public class Printdatatype {

	public static void main(String[] args) {
		int x=1000;
		System.out.println(x);
		System.out.println(x +"-"+((Object)x).getClass().getSimpleName());

	}

}
