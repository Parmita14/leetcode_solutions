class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x%10 == 0 && x !=0)){
            return false;
        }
        int temp = 0;
        int a = x;
        while(x>temp){
            temp = temp * 10 + x%10;
            x /= 10;
        }
        if(x == temp || x == temp/10){
            return true;
        }
        return false;
 }}
