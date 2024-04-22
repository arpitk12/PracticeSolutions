import java.util.Arrays;
import java.util.HashMap;
class TwoSum {
  public static int[] twoSum(int[] nums, int target) {
    int[] arr = new int[2];
    HashMap<Integer, Integer> map = new HashMap<>();

    for(int i=0;i<nums.length;i++){
      if(map.containsKey(target-nums[i])){
        arr[0] = map.get(target-nums[i]);
        arr[1] = i;
        return arr;
      }
      map.put(nums[i],i);
    }
    return arr;
  }

  public static void main(String[] args){
    System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
    System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
    System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));
  }
}

