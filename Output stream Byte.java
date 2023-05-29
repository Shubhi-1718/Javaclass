import java.io.*;
class FileOutputExaample
{
	public static void method()
	{
		try
		{
			FileOutputStream fout = new FileOutputStream("C:\\Users\\student\\Desktop\\Hello.txt");
			String s="hello Pratyush";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Sucesss........");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class FileStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputExaample.method();
	}

}
