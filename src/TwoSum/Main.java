package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void positions(Integer[] nums, Integer target){
        Map<Integer[],Integer> map = new HashMap<>();
        map.put(nums,target);

        for (int i = 0; i < nums.length; i++) {
            Integer dif = target - nums[i];
            if (map.containsValue(dif)){
                System.out.println(map);


            }






        }
    }

    public static void main(String[] args) {
        Integer[] nums = {2,7,11,15};
        Integer target = 9;
        positions(nums,target);
    }
}
