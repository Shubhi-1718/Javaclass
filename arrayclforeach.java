package college;
import java.util.Scanner;

public class arraycl {

	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
	
		int arr[]= new int[10];
		int n=5;
		
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		for(int i:arr)
		{
			if(i==0)
				break;
			else
			System.out.print(i+" ");
			
		}
	}

}
