class plus_one {
    public int[] plusOne(int[] digits) {
        int i;
       for(i = digits.length - 1;i>=0;i--){
           if(digits[i] < 9 ){
               digits[i]++;
               return digits;
           }
           digits[i] = 0;
       }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
       
    }
}