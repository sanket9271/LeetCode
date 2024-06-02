package string;

public class ReverseString {

	public static void reverseString(char[] s) {
        char temp;
        for(int i=0, j=s.length-1; i<=j && j >= i; i++, j--) {
        	temp = s[i];
        	s[i] = s[j];
        	s[j]= temp;
        }
        for(int i=0;i<s.length;i++) {
        	System.out.print(s[i]+" ");
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString(new char[] {'h','l','o'});
	}

}
