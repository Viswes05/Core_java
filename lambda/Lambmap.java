package lambda;
import java.util.*;
public class Lambmap {

	public static void main(String[] args) {
		Map<String, String> data=new HashMap<String,String>();
		data.put("Company", "SysTech");
		data.put("Language", "Java");
		data.put("Topic", "Lambda expression");
		data.forEach((key,value)->System.out.println(key+" :"+value));

	}

}
