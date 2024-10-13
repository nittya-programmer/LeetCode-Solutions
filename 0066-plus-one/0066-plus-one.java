class Solution {
    public int[] plusOne(int[] digits) {
         for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;  // Set current digit to 0 and move to the next left digit
        }
        
        // If we reach this point, all digits were 9
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; // Set the first digit to 1, all others will be 0 by default
        return newDigits;
}}