package array;

import java.util.LinkedHashMap;
import java.util.*;

public class TwoSum {

	public static void twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm = new LinkedHashMap();

        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(target-nums[i]))
            {
                System.out.print(hm.get(target-nums[i])+" ");
                System.out.println(i);
            }
            hm.put(nums[i],i);
        }
    }
	
	public static void main(String[] args) {
		twoSum(new int[]{2,7,11,15}, 17);
	}

}
