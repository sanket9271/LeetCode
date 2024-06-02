package array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

	public static boolean containsDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<Integer>();
        for(int i =0 ;i<nums.length;i++)
        {
        	if(!hs.add(nums[i])){
        		return true;
        	}
        }
        return false;
    }
	
	public static void main(String[] args) {
		System.out.println(containsDuplicate(new int[] {1,2,3,1}));
	}

}
