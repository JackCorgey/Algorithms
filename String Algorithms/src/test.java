import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String needle = "aaaaaaaaaaaaaaaaaa";
		//String haystack = "patternlatternpatternpatternlatternpatternlattern";
		String haystack = "aaaaaaaaaa";
		
		ArrayList<Integer> matched = JxString.simple_search(needle, haystack);
		System.out.println(matched);
		
	}
	
	public static void change(char[] letter) {
		letter[0] = '3';
	}

}
