class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length-1;

        if(target == 'z' || target >= letters[n]) return letters[0];

        int start = 0;
        int end = letters.length-1;

        while (start <= end){
            int mid = start + (end-start)/2;

            if(letters[mid] == target){
                while(letters[mid] == letters[mid+1]){
                    mid++;
                }
                if(mid == n){
                    return letters[0];
                }
                return letters[mid+1];
            }

            else if(letters[mid] < target){
                start = mid + 1;
            }

            else{
                end = mid - 1;
            }
        }

        return letters[start];
    }
}