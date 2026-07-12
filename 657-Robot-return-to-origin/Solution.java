class Solution {
    public boolean judgeCircle(String moves) {

        int ucount = 0;
        int lcount = 0;

        for(char currentChar : moves.toCharArray()){
            if(currentChar == 'U'){
                ucount++;
            }
            else if(currentChar == 'D'){
                ucount--;
            }
            else if(currentChar == 'L'){
                lcount++;
            }
            else{
                lcount--;
            }
        }
        return ucount == 0 && lcount ==0;
        
    }
}