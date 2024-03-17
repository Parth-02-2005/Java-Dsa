import java.util.*;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array:");
        for(int i = 0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter target:");
        target = sc.nextInt();
        System.out.println(nums);
        return twoSum(nums, target);
    }
   
}