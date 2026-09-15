package iostreams;
import java.io.*;
import java.util.Scanner;

public class Mergefile2 {
    public static void main(String[] args) throws IOException {
        File x = new File("d:\\file.txt");
        File m = new File("d:\\text1.txt");
        FileWriter p = new FileWriter("d:\\merge.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(p); // Improves efficiency

        // Reading first file
        Scanner t = new Scanner(x);
        while (t.hasNextLine()) {  // Reads entire line (handles both text & numbers)
            bufferedWriter.write(t.nextLine());
            bufferedWriter.newLine(); // Adds a new line
        }
        t.close(); // Close after use

        // Reading second file
        Scanner t1 = new Scanner(m);
        while (t1.hasNextLine()) {
            bufferedWriter.write(t1.nextLine());
            bufferedWriter.newLine();
        }
        t1.close(); 

        bufferedWriter.close(); // Close writer
        System.out.println("Process Completed. Files Merged Successfully!");
    }
}
