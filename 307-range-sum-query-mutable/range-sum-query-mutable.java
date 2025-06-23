class NumArray {
    int arr[];
    int bit[];
    int n;

    public NumArray(int[] nums) {
        arr = nums;

        int n = nums.length; 

        bit = new int[n+1];

        for(int i=0; i<nums.length; i++){
            build(i, nums[i]);
        }
    }

    public void build(int i, int val){
        i = i+1;

        while(i < bit.length){
            bit[i] += val;

            i = i + (i & (-i));
        }
    }
    
    public void update(int index, int val) {
        
        int diff = val - arr[index];

        arr[index] = val;

        index = index + 1;

        while(index < bit.length){
            bit[index] += diff;

            index = index + (index & (-index));
        }
    }

    public int range(int i){

        i = i+1;
        int res = 0;

        while(i > 0){
            res += bit[i];

            i = i - (i & (-i));
        }

        return res;
    }
    
    public int sumRange(int left, int right) {
        return range(right) - range(left-1);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */