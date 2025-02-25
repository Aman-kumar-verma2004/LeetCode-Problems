import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int  i = 0; i<n; i++) {
            map.put(nums[i], i);
        }
        for(int i = 0; i< n; i++){
            int num = nums[i];
            int rem = target - num;
            if(map.containsKey(rem)){
                int index =  map.get(rem);
                if(index == i) continue;
                return new int[]{i, index};
            }

        }
        return new int[]{};
    }
}