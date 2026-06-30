package string_functions;

public class $Count_Words {
	public static void main(String[] args) {
		String str = "have a great day";
		String arr[] = str.split(" ");
		int count = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			count++;
		}
		System.out.println(count);
	}

}
