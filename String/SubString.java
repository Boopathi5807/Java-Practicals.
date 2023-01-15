package string;

//in String substring() method used to display the String values at our index parameter. like(zero based)
public class SubString 
{

	public static void main(String[] args) 
	{
		           //0123456789 
		String Name="SelvaBooathi";
		
		System.out.println(Name.substring(3));//substring() method with only (start) parameter.
		
		System.out.println("**********************");
		
		System.out.println(Name.substring(2,6));//substring() method with (start) and (end) parameter. 
	}

}