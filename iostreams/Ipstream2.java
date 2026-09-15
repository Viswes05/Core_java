package iostreams;
import java.io.*;

public class Ipstream2 {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("d:\\Output1.txt");
        int i=0;
        
        while((i = f.read()) != -1) 
        { 
            System.out.print((char)i); 
        }
        
        f.close();
    }
}
