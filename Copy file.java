import java.io.*;
class Copying
{
	public static void copy()
	{
		try
		{
			FileInputStream fin= new FileInputStream("C:\\\\Users\\\\student\\\\Desktop\\\\Hello.txt");
			FileOutputStream fout = new FileOutputStream("C:\\Users\\student\\Desktop\\Hello1.txt");
			int i=0;
			while((i=fin.read())!=-1)
			{
				fout.write(i);
			}
			fin.close();
			fout.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
public class CopyFile {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Copying.copy();
	}

}
