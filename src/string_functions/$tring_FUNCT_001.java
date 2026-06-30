package string_functions;

public class $tring_FUNCT_001 {
	public static void main(String[] args) {
		String str="keep going great thing takes time";
		String []arr=str.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
