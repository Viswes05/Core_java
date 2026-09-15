package builtin;

import java.util.Calendar;

public class calendaar {

	public static void main(String[] args) {
		Calendar c= Calendar.getInstance();
		System.out.print(c.get(Calendar.DATE));
		System.out.print(c.get(Calendar.MONTH));
		System.out.print(c.get(Calendar.YEAR));

	}

}
