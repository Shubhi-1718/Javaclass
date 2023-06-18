
import java.util.*;
class InvalidInputException extends Exception
{
	InvalidInputException(String msg)
	{
		super(msg);
	}
}
class Customer
{
	private String custNo;
	private String custName;
	private String category;
	Customer(String custNo,String custName,String category) throws InvalidInputException 
	{
		this.custNo=custNo;
		this.custName=custName;
		this.category=category;
		if(!custNo.startsWith("C") && !custNo.startsWith("c"))
			throw new InvalidInputException("Invalid customer Number");
		if(custName.length()<4)
			throw new InvalidInputException("Invalid customer Name");
		if(!category.equals("Platinum") && !category.equals("Gold") && !category.equals("Silver"))
			throw new InvalidInputException("Invalid category");
		
	}
	String getcustno()
	{
		return custNo;
	}
	String getcustname()
	{
		return custName;
	}
	String getcategory()
	{
		return category;
	}
}
public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		try
		{
			System.out.println("Enter customer name");
			String custName = sc.nextLine();
			System.out.println("Enter customer number");
			String custNo = sc.nextLine();
			System.out.println("Enter category");
			String category = sc.nextLine();
			
			Customer cust = new Customer(custNo,custName,category);
			System.out.println("Customer No "+ cust.getcustno());
			System.out.println("Customer Name"+ cust.getcustname());
			System.out.println("Category"+cust.getcategory());
			
		}
		catch(InvalidInputException e)
		{
			System.out.println("Invalid Input "+ e.getMessage());
		}
	}

}
