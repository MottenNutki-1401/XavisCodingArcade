package cpcodes;

public class TwoSumLeet {

    public int [] twoSum(int[] nums, int target){

      for (int i =0; i <nums.length;i++) {
        for (int j = i+1; j < nums.length; j++) {
            {
                if (nums[i] + nums [j]==target) 
                    return new int [] {i, j};
            }

        }
      }
         return new int [] {};
    }
    
    public static void main (String[] args){
        TwoSumLeet ans = new TwoSumLeet ();

        int [] nums = {1,2,3,4,5,6};
        int target = 9;

        int [] result = ans.twoSum(nums,target);
        if (result.length ==2){
        System.out.println(+result[0]+ " " +result[1]);
        }
    }
}
