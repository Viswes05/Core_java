package iostreams;

import java.io.File;
public class Readfile5 {

	public static void main(String[] args) {
		File x=new File( "d:\\file.txt");
		if(x.exists())
		{
			System.out.println("File name is "+x.getName());
			System.out.println("File Location "+x.getPath());
			System.out.println("File Read permission  "+x.canRead());
			System.out.println("File Write permission  "+x.canWrite());
			System.out.println("File Size "+x.getTotalSpace());

		}
		else
		{
			System.out.println("Error");
		}
		
		
	}

}
