import java.io.*;
import java.util.Scanner;
class Reading 
{
	public static void method()
	{
		try
		{
			File f1= new File("C:\\\\Users\\\\student\\\\Desktop\\\\Helllo.txt");
			Scanner data =new Scanner(f1);
			while(data.hasNextLine())
			{
				String fdata = data.nextLine();
				System.out.println(fdata);
			}
			data.close();
		}
		catch(IOException e)
		{
			System.out.println("file not found");
			e.printStackTrace();
		}
		
	}
}

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reading.method();

	}

}
