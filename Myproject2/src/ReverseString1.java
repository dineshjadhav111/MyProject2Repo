
public class ReverseString1 {

	public static void main(String[] args) {

		String act="Dinesh";
		String rev="";
		
	for(int i=act.length()-1; i>=0; i--)
	{
		rev=rev+act.charAt(i);
	}
	System.out.println("Reverse of String is :"+rev);
	System.out.println("Actual String is :"+act);
	
	if(act.equals(rev))
	{
		System.out.println("Given string is pallindrome");
	}
	else
	{
		System.out.println("Not pallindrome");
	}
	}

}
