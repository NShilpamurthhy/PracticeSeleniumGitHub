package string_functions;

public class $tring_FUNCT_001 {
	public static void main(String[] args) {
		String str="keep going great thing takes time";
		
		String []arr=str.split(" ");
		
		System.out.println("\nPrinting the array of words in reverse order\n");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nTo print in forward direction\n");
		
		for(int i=0;i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
