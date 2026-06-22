class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;

        int maxSpeed = 0;
        for(int pile : piles){
            maxSpeed = Math.max(maxSpeed , pile);
            }

            while(minSpeed <= maxSpeed){
                int mid = minSpeed + (maxSpeed - minSpeed)/2;

                long hours = 0;
                for(int pile : piles){
                    hours += (int) Math.ceil((double) pile / mid); 
                }
                if(hours <= h){
                    maxSpeed = mid - 1;
                }
                else{
                    minSpeed = mid + 1;
                }
        }
        return minSpeed;
    }
}