package greater;

public class perfect {

	public static void main(String[] args) {
		int n=6;
		int i=1,sum=0;
		while(i<=n/2)
		{
			if(n%i==0)
				sum=sum+i;
			i=i+1;
		}
		if(sum==n)
			System.out.println("It is a perfect number ");
		else
			System.out.println("It is not a perfect number ");
	}

}
