class Solution {
    public int mySqrt(int x) {
        int ans = 0;
       long  low = 0, high  = x;

        while(low <= high){

        long  mid = low +(high - low)/2;
        if(mid * mid == x)
            return (int) mid;
        else if(mid * mid < x){
            ans = (int) mid;
            low = mid + 1;
        }
        else{
            high = mid -1;
        }

        }

        return ans;
        
    }
}