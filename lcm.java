package greater;

public class lcm {

	public static void main(String[] args)  {
		int x=72,y=120;
		int gcd=1,lcm;
		for(int i=1;i<=x && i<=y;i++)
		{
			if(x%i==0 && y%i==0)
				gcd=i;
		}
		lcm= (x*y)/gcd;
		System.out.println("LCM Is "+lcm);
	}
}
