import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String needle = "pattern";
		String haystack = "zzzzzzzzzzzzzzzzzzzzzttttpatternpattern";
		
		System.out.println( JxString.findAll(needle, haystack) );
		
		//ArrayList<Integer> matched = JxString.simple_search(needle, haystack);
		//System.out.println(matched);
		
	}

}
