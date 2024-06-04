package string;

public class AppendToMakeSubSeq {

	public static int appendCharacters(String s, String t) {
		
		int j=0;
		
		for(int i =0; i<s.length(); i++) {
			if(t.length()>j && s.charAt(i) == t.charAt(j)) {
				j++;
			}
		}
		
		return (t.length())-j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(appendCharacters("coaching", "coding"));

	}

}
