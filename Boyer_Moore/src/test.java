import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String needle = "pattern";
		String haystack = "patternabcdefghijklmnopatternpattern";
		
		System.out.println( Boore_Moore.findAll(needle, haystack) );
		
		//ArrayList<Integer> matched = JxString.simple_search(needle, haystack);
		//System.out.println(matched);
		
	}

}
