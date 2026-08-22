class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        if(hs.size() < 3){
    return Collections.max(hs);
}
        int[] arr=new int[hs.size()];
        int z=0;
        for(int j: hs){
            arr[z++]=j;

        }
        Arrays.sort(arr);
        return arr[arr.length-3];

        
    }
}