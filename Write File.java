import java.io.*;
class Writing
{
	public void method()
	{
		try
		{
			FileWriter f1=new FileWriter("C:\\Users\\student\\Desktop\\Hello.txt");
			f1.write("Hello pratyush..How are you");
			f1.close();
			System.out.println("Content successfully written ");
		}
		catch(IOException e)
		{
			System.out.println("Unexpected error");
			e.printStackTrace();
		}
	}
}
public class WriteFile {

	public static void main(String[] args) {
		
		Writing fwrite =new Writing();
		fwrite.method();
	}

}
