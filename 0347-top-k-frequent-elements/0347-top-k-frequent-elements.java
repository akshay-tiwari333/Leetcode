class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int x : nums) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        while(list.size() < k) {

            int max = 0;
            int key = 0;

            for(int x : hm.keySet()) {

                if(hm.get(x) > max) {
                    max = hm.get(x);
                    key = x;
                }
            }

            list.add(key);
            hm.remove(key);
        }

        int[] ans = new int[k];

        for(int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}