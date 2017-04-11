import java.util.ArrayList;
import java.util.HashMap;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String needle = "pattern";
		String haystack = "patternabcdefghijklmnopatternpattern";
		
		System.out.println( Boyer_Moore.findAll(needle, haystack) );
		
		//ArrayList<Integer> matched = JxString.simple_search(needle, haystack);
		//System.out.println(matched);
		
		HashMap<Character,Integer> t = new HashMap<Character,Integer>();
		t.put('a', 10);
		t.put(null, 11);
		
		
	}

}
