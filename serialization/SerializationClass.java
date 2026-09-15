package serialization;
import java.io.*;
public class SerializationClass {

	public static void main(String[] args) {
		Emp emp=new Emp();
		emp.name="Admin";
		emp.Salary=20000;
		emp.Address="Trichy";
		try
		{
			FileOutputStream fout=new FileOutputStream("Char.txt");
			ObjectOutputStream dout=new ObjectOutputStream(fout);
			dout.writeObject(emp);
			dout.close();
			fout.close();
			System.out.println("Serialized Data is saved in char.txt file");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
