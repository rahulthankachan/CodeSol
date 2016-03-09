import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestPad {

	public static void main(String[] args) {

		InputStream in = null;
		OutputStream os = null;

		try {
				in = new FileInputStream("Readme.txt");
				os = new FileOutputStream("Readme2.txt");

				System.out.println("The integer values of the character is " + (char)in.read());

				int val = 0;
				StringBuilder myString = new StringBuilder();
				while ((val = in.read()) > -1 ) {
					myString.append((char)val);
					os.write(val);
				}

				System.out.println("The value is");
				System.out.println(myString.toString());

			}
		catch (IOException e) {

		} finally {
			try {
				in.close();
				os.close();

			} catch (IOException e) {

			}
			


		}

	}


}
