

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer> sortedKeys = new ArrayList<>(count.keySet());
        sortedKeys.sort((a, b) -> count.get(b) - count.get(a));

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = sortedKeys.get(i);
        }
        return res;
    }
}
