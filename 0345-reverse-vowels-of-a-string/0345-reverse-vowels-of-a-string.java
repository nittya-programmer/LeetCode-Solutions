class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray(); // Convert to mutable char array
        int left = 0, right = s.length() - 1;
        String vowels = "aeiouAEIOU"; // Helper for easy checking

        while (left < right) {
            // Move left pointer until it hits a vowel
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            // Move right pointer until it hits a vowel
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }
            
            // Swap the vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            // Move pointers inward to continue
            left++;
            right--;
        }
        
        return new String(chars); // Return the final result
    }
}
