##I/O


`java.io`

**InputStream** Stream of data which is coming inside a program is called the inputStream.

`RAW DATA - IMAGE DATA`


*  **read()** method will read a byte (int) and then return **-1** if the end of the file is reached.
*  **write()** method can be used to write the file in the other file


`````
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class TestPad {

	public static void main(String[] args)  throws Exception {

		InputStream in = new FileInputStream("Readme.txt");
		OutputStream os = new FileOutputStream("Readme2.txt");

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
}







``````

###Close the streams after the use


*  `finally block will not have the access to the variables` which are inside the **try block**
*  THAT'S why we have to use the following 

``````
try (Resources) {

} catch (Exception e) {

}

Now there is no need to close the resources
Also there is no need of using the finally block also now


``````


###EVEN Better

*  Put the resources in the try(  here )
*  If done like this then there is no need to add the close() method and Java will automatically handle that for us.


###Reader and the Writer
They are meant for reading the characters specially.


### Forward / in the folder structure


###For Reading and writing the character data 
We can use the Reader and Writer


```````
Reader in = new FileReader("Path to the file");
Writer w = new FileWriter("The path to the file");


```````

Also the above is a convenience Class. The `meat` is here


``````

	String nameOfTheFolder = "myfolder/Readme3.txt";
		try (Reader in = new InputStreamReader(new FileInputStream("Readme.txt"), "UTF-8");
			Writer out = new OutputStreamWriter(new FileOutputStream(nameOfTheFolder), "UTF-8")) {




``````


##TO Write a string directly 
We can use the FileWriter class directly -> Accesed via Writer


````````

buffReader = new BufferedReader(new FileReader(ACCOUNT_FILE_NAME));
String accountData = null;
while ((accountData = buffReader.readLine()) != null) {
		BankAccount acc = BankAccount.parse(accountData);
		accounts.put(acc.getAccountNumber(), acc);
		data we have in the file
		setAccNumGeneratorForStoredData(acc.getAccountNumber()
		
		);




````````

###Concept of BufferedReader / Writer:

1. It is just used to wrap the original statements used for the reading and writing of the data
2. The important concept is for the **readLine()** method. This method reads one line at a time.

###ValueOF(String)

` ENUMTYPE.valueOf("String")`

Can be used to get the correspodin value from the Enum for the value asked.

###ToString()
Method can be usd to convert an object into its String form

###parse()
A static parse method can be made which returns the Type of the obejct from the String which is read from a maybe a file
 