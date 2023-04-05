package greater;

public class gcd {

	public static void main(String[] args) {
		int x=6,y=12;
		int gcd=1;
		for(int i=1;i<=x && i<=y;i++)
		{
			if(x%i==0 && y%i==0)
				gcd=i;
		}
		System.out.println("gcd of the x and y is "+gcd);
	}

}
