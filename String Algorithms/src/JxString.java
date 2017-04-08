import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class JxString {
	
	static class Boore_Moore {
		
		String needle, haystack;
		HashMap<Character,Integer> jmpIndex;
		
		Boore_Moore(String needle, String haystack) {
			this.needle = needle;
			this.haystack = haystack;
			iniJmpIndex();
		}
		
		void iniJmpIndex() {
			jmpIndex = new HashMap<Character,Integer>();
			for(int i = 0, len = needle.length()-1; i < len; ++i)
				jmpIndex.put(needle.charAt(i), needle.length()-1 - i);
		}
		
		ArrayList<Integer> boyer_moore_search() {	
			int in = 0;
			ArrayList<Integer> matched = new ArrayList<Integer>();
			while( (needle.length()+in) <= haystack.length() ) {
				int jmp = getJmp(in);
				System.out.println(jmp);
				if(jmp == -1)
					matched.add(in++);
				else 
					in += jmp;
			}
			
			return matched;
		}
		
		int getJmp(int in) {
			int match = needle.length()-1;
			while(match >= 0) {
				if(needle.charAt(match) != haystack.charAt(in+match))
					break;
				--match;
			}
			
			if(match == -1)
				return match;
			
			char anchor = haystack.charAt(in + needle.length()-1);
			return ( jmpIndex.containsKey(anchor) ) ? jmpIndex.get(anchor) : needle.length();
			
		}
		
		String test() {
			return "test";
		}
		
	}
	
	public static ArrayList<Integer> findAll(String needle, String haystack) {
		Boore_Moore bm = new Boore_Moore(needle, haystack);
		return bm.boyer_moore_search();
	}

	
}
