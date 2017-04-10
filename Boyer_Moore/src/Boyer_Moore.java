import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Boyer_Moore {

		public static ArrayList<Integer> findAll(String needle, String haystack) {	
			ArrayList<Integer> matched = new ArrayList<Integer>();
			HashMap<Character,Integer> jumpDict = iniJumpDict(needle);

			int	nLen = needle.length(), anchor = nLen - 1, end = haystack.length();
			
			int in = anchor, diff = 0;
			while(anchor < end) {
				if( (diff = anchor - in) == nLen ) {
					matched.add(++in);
					in = ++anchor;
				} else if ( needle.charAt(nLen-1 - diff) != haystack.charAt(in) ) {
					char c = haystack.charAt(anchor);
					int add = ( jumpDict.containsKey(c) ) ? jumpDict.get(c) : needle.length();
					in = anchor = anchor + add;
				} else {
					--in;
				}	
			}

			return matched;
		}

		private static HashMap<Character,Integer> iniJumpDict(String pattern) {
			HashMap<Character,Integer> jumpDict = new HashMap<Character,Integer>();
			for(int i = 0, len = pattern.length()-1; i < len; ++i)
				jumpDict.put(pattern.charAt(i), pattern.length()-1 - i);
			return jumpDict;
		}

	}