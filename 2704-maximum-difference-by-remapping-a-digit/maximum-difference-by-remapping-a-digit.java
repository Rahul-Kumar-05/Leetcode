class Solution {
    public int minMaxDifference(int num) {
        
        String str = Integer.toString(num);
        char[] max = str.toCharArray();
        char[] min = str.toCharArray(); 

        char replaceMax = ' ';
        for(int i=0; i<max.length; i++){
            if(max[i] != '9'){
                replaceMax = max[i];
                break;
            }
        }

        for(int i=0; i<max.length; i++){
            if(max[i] == replaceMax){
                max[i] = '9';
            }
        }

        char replaceMin = min[0];
        for(int i=0; i<min.length; i++){
            if(min[i] == replaceMin){
                min[i] = '0';
            }
        }

        int maxVal = Integer.parseInt(new String(max));
        int minVal = Integer.parseInt(new String(min));

        return maxVal - minVal;
    }
}