import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestPad {

	public static void main(String[] args) {


		try (InputStream in = new FileInputStream("Readme.txt");
			 OutputStream os = new FileOutputStream("Readme2.txt")
			) {

			int x = 0;
			StringBuilder m = new StringBuilder();

			while((x = in.read()) > -1) {
				os.write(x);
				m.append((char)x);
			}

			System.out.println("The value is ");
			System.out.println(m.toString());

		} catch (Exception e) {

		} 


	}

}
