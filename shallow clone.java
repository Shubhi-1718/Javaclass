class Deepclone
{
	int x,y;
}
class DeepClone2 implements Cloneable
{
	int a,b;
	Deepclone c= new Deepclone();
	public Object clone() throws CloneNotSupportedException
	{
		DeepClone2 t2 = new DeepClone2();
		t2.c = new Deepclone();
		t2.c.x=c.x;
		t2.c.y=c.y;
		return (DeepClone2)super.clone();
	}
}
public class Cloning
{

	public static void main(String[] args) throws CloneNotSupportedException
	{
		DeepClone2 t =new DeepClone2();// TODO Auto-generated method stub
		t.a=10;
		t.b=20;
		t.c.x=30;
		t.c.y=40;
		DeepClone2 t3=(DeepClone2)t.clone();
		t3.a=100;
		t3.c.x=300;
		System.out.println(t.a+" "+t.b+" "+t.c.x+" "+t.c.y);
		System.out.println(t3.a+" "+t3.b+" "+t3.c.x+" "+t3.c.y);

	}

}
