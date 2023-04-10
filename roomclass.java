package assignments;

class Room 
{
	int roomno;
	String roomtype;
	int roomarea;
	String acmachine;
	void setData(int r, String c, int a, String ac)
	{
		roomno=r;
		roomtype=c;
		roomarea=a;
		acmachine=ac;
	}
	void displayData()
	{
        System.out.println("Room number is "+ roomno);
        System.out.println("Room type " + roomtype);
        System.out.println("Room area " + roomarea);
        System.out.println("AcMachine "+ acmachine);
    }
}
public class roommain {

	public static void main(String[] args)
	{
		int r,a;
		String type;
		String ac;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter room No. ");
		r=sc.nextInt();
		System.out.println("Enter room type ");
		type=sc.next();
		System.out.println("Enter room area ");
		a=sc.nextInt();
		System.out.println("Enter acMachine ");
		ac=sc.next();
		Room r1=new Room();
		r1.setData(r, type, a , ac);
		r1.displayData();
	}

}
