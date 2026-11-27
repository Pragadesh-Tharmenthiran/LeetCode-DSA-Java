class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> mapList = new HashMap<>();

        for (int num : nums) {
            mapList.put(num, mapList.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entity : mapList.entrySet()) {
            if (entity.getValue() > nums.length / 2) {
                return entity.getKey();
            }
        }
        return -1;
    }
}