class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        return nums[nums.length/2];
        /*int result = 0;
        Map<Integer,Integer> hmap = new HashMap<>();
        
        for(int i = 0 ; i < nums.length; i++) {
            if(hmap.containsKey(nums[i]))
                hmap.put(nums[i],hmap.get(nums[i])+1); 
            else
                hmap.put(nums[i],1);
            
            if(hmap.get(nums[i]) > nums.length/2) {
                 result = nums[i];
                break;
            }
            
        }
        
        /*for(Map.Entry<Integer,Integer> entry : hmap.entrySet()) {
            System.out.println("key "+entry.getKey()+" Value : "+entry.getValue());
            if(entry.getValue() > Math.ceil(nums.length/2))
                return entry.getKey();
        }*/
        
        /*return result;*/
    }
}
