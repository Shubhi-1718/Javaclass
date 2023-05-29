import java.io.*;
class Creation
{
	public static void create()
	{
		try
		{
			File f1=new File("C:\\Users\\student\\Desktop\\Hello.txt");
			if(f1.createNewFile())
			{
				System.out.println("File "+f1.getName()+" is created");
			}
			else
			{
				System.out.println("File already exists");
			}
		}
		catch(IOException e)
		{
			System.out.println("An unexpected error ");
			e.printStackTrace();
		}
	}
}
public class FileHandle 
{
	public static void main(String args[])
	{
		Creation.create();
	}
}
