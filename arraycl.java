package college;
import java.util.Scanner;

public class arraycl {

	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
	
		int arr[]= new int[10];
		
		for(int i=0;i<3;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		for(int i=0;i<3;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}
