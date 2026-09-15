package serialization;

import java.io.*;

public class DeserializationClass {

	public static void main(String[] args) throws IOException , ClassNotFoundException {
		Emp emp=null;
		try
		{
			FileInputStream fin=new FileInputStream("Char.txt");
			ObjectInputStream din=new ObjectInputStream(fin);
			emp=(Emp)din.readObject();
			din.close();
			fin.close();
		}
		finally
		{
			System.out.println(" Deserialization Employee");
			System.out.println(" First Name of the Employee "+emp.name);
			System.out.println(" Salary of the Employee "+emp.Salary);
			System.out.println(" Address of the Employee "+emp.Address);

		}
	}

}
