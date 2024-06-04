package array;

public class ProductExceptSelf {

	public static int[] product(int[] nums) {
		
		int size = nums.length;
		
		int[] result = new int[size];
		
		int[] left = new int[size];
		
		int[] right = new int[size];
		
		left[0]=1;
		right[size-1]=1;
		
		
		for(int i=1; i<size; i++) {
			left[i] = nums[i-1]*left[i-1];
		}
		
		for(int j=size-2; j>=0; j--) {
			right[j] = nums[j+1]*right[j+1];
		}
		
		for(int k=0; k<size; k++) {
			result[k] = left[k]*right[k];
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		product(new int[] {1,2,3,4});

	}

}
