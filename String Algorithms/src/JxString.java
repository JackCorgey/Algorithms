import java.util.ArrayList;
import java.util.Arrays;

public class JxString {

	
	public static ArrayList<Integer> boyer_moore_find(String _needle, String _haystack) {
		char[] needle = _needle.toCharArray(),
			   haystack = _haystack.toCharArray();	
		
		int in = 0;
		ArrayList<Integer> matched = new ArrayList<Integer>();
		while( (needle.length+in) <= haystack.length ) {
			int jmp = isMatch(needle, haystack, in);
			if(jmp == -1) {
				matched.add(in);
				++in;
			} else {
				in += jmp;
			}
		}
		
		return matched;
	}
	
	private static int isMatch(char[] needle, char[] haystack, int in) {
		int match = needle.length-1;
		while(match >= 0) {
			if(needle[match] == haystack[in+match])
				--match;
			else 
				break;
		}
		
		if(match != -1)
			match = (needle.length - match);
		
		return match;
	}
	
}
