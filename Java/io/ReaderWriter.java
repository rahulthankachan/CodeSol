import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.io.FileReader;
import java.io.FileWriter;


public class TestPad {

	public static void main(String[] args) {

		String nameOfTheFolder = "myfolder/Readme3.txt";
		try (Reader in = new FileReader("Readme.txt");
			Writer out = new FileWriter(nameOfTheFolder)) {

			int i = 0;

			String x = "";
			while ((i = in.read()) > -1) {
				x += (char)i;
				out.write(i);
			} 

			System.out.println("The read character is " + x);

			out.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}



	} 
}
