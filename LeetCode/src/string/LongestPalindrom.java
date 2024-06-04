package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LongestPalindrom {

	public static int longestPalindrome(String s) {
		boolean hasOdd =false;
		
		if (s.length() == 0) {
			return 0;
		}
		if (s.length() == 1) {
			return 1;
		}
		Set<Character> set = new HashSet<Character>();

		Map<Character, Integer> hm = new HashMap<Character, Integer>();

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			
			hm.put(s.charAt(i) ,hm.getOrDefault(s.charAt(i), 0) +1);
		}

		for (Entry<Character, Integer> mapElement : hm.entrySet()) {

			if (mapElement.getValue() % 2 == 0) {
				count = count + mapElement.getValue();
			} else {

				count = (count + mapElement.getValue()) - 1;
				hasOdd = true;
			}

		}

		if(hasOdd) {
			return count+1;
		}
		return count;

	}

	public static void main(String[] args) {
		System.out.println(longestPalindrome("tattarrattat"));
	}
}
