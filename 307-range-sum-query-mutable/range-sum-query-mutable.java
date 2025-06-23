class NumArray {
    int nums[];
    int segt[];
    int n;

    public NumArray(int[] nums) {
        this.nums = nums;
        n = nums.length;

        segt = new int[4*n];

        buildTree(0, 0, n-1);
    }

    public void buildTree(int idx, int low, int high){
        if(low == high){
            segt[idx] = nums[low];
            return;
        }

        int mid = low + (high - low)/2;

        buildTree(2*idx+1, low, mid);
        buildTree(2*idx+2, mid+1, high);

        segt[idx] = segt[2*idx+1] + segt[2*idx+2];
    }
    
    public void update(int index, int val) {
        Rupdate(0, 0, n-1, index, val);    
        return;    
    }

    public void Rupdate(int idx, int low, int high, int i, int nv){
        if(low == high){
            nums[i] = nv;
            segt[idx] = nv;
            return;
        }

        int mid = low + (high-low)/2;

        if(i >= low && i <= mid){
            Rupdate(2*idx+1, low, mid, i, nv);
        }
        else{
            Rupdate(2*idx+2, mid+1, high, i, nv);
        }

        segt[idx] = segt[2*idx+1] + segt[2*idx+2];
    }
    
    public int sumRange(int left, int right) {
        return Rsum(0, 0, n-1, left, right);
    }

    public int Rsum(int idx, int low, int high, int left, int right){
        if(low >= left && high <= right){
            return segt[idx];
        }

        if(low > right || high < left){
            return 0;
        }

        int mid = low + (high-low)/2;

        int lt = Rsum(2*idx+1, low, mid, left, right);
        int rt = Rsum(2*idx+2, mid+1, high, left, right);

        return lt + rt;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */