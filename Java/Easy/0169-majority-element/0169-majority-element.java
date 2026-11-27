class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> mapList = new HashMap<>();
        int res = 0;
        int majority = 0;
        for (int num : nums) {
            mapList.put(num, mapList.getOrDefault(num, 0) + 1);
            if (mapList.get(num) > majority) {
                res = num;
                majority = mapList.get(num);
            }
        }

       
        return res;
    }
}