class Test 
{
	int x,y;
	
}
class Test2 implements Cloneable
{
	int a,b;
	Test c= new Test();
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class TEST3 {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Test2 t =new Test2();// TODO Auto-generated method stub
		t.a=10;
		t.b=20;
		t.c.x=30;
		t.c.y=40;
		Test2 t2=(Test2)t.clone();
		t2.a=100;
		t2.c.x=300;
		t2.c.y=700;
		System.out.println(t.a+" "+t.b+" "+t.c.x+" "+t.c.y);
		System.out.println(t2.a+" "+t2.b+" "+t2.c.x+" "+t2.c.y);
	}

}
