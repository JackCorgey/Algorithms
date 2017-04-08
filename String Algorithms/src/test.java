import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String needle = "pattern";
		String haystack = "patternlatternpatternpatternlatternpatternlattern";
		
		ArrayList<Integer> matched = JxString.boyer_moore_find(needle, haystack);
		System.out.println(matched);
		
	}
	
	public static void change(char[] letter) {
		letter[0] = '3';
	}

}
