import java.io.*;
class Userdefined 
{
	public static void method() throws FileNotFoundException
	{
		FileReader file = new FileReader("C:\\Users\\student\\Desktop\\Hello.txt");
		BufferedReader fileInput = new BufferedReader(file);
		throw new FileNotFoundException();
		
	}
}
public class Userclass {

	public static void main(String[] args) 
	{
		try
		{
			Userdefined.method();
		}
		catch(FileNotFoundException ude)
		{
			ude.printStackTrace();
		}
		System.out.println("Use of throws and throw");
	}

}
