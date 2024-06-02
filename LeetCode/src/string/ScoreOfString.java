package string;

public class ScoreOfString {

	
	public static int scoreOfString(String s) {
        char[] arr = s.toCharArray();
        int score=0;
        for(int i=0;i<arr.length-1;i++)
        {
            score= score+Math.abs((int)arr[i]-(int)arr[i+1]);
        }
        return score;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(scoreOfString("hello"));

	}

}
