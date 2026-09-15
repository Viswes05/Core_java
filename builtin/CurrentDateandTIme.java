package builtin;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class CurrentDateandTIme {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime t= LocalTime.now();
		System.out.println(t);
		LocalDateTime w=LocalDateTime.now();
		System.out.println(w);
	}

}
