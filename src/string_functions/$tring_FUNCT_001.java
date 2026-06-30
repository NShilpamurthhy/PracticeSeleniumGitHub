package string_functions;

public class $tring_FUNCT_001 {
	public static void main(String[] args) {
		String str="keep going great thing takes time";
		
		String []a=str.split(" ");
		
		System.out.println("\nPrinting the array of words in reverse order\n");
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}
		
	
		
		for(int i=0;i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
