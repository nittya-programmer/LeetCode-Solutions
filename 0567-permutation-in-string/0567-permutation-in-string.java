class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // int k=0;
        // boolean isIncluded=true;
        // HashMap<Character, Integer> map = new HashMap<>();
        // while(k <= s2.length() - s1.length()) {
        //     isIncluded=true;
            
        //     for (int i = 0; i < s1.length(); i++) {
        //         map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        //     }
        //     for (int j = k; j < k + s1.length(); j++) {
        //         if (map.containsKey(s2.charAt(j))) {
        //             map.put(s2.charAt(j), map.getOrDefault(s2.charAt(j), 0) - 1);
        //         }
        //     }
        //     for (int value : map.values()) {
        //         if (value != 0) {
        //             isIncluded=false;
        //             k++;
                    
        //         }
        //     }
        //     map.clear();
        //     if(isIncluded){
        //         return isIncluded;
        //     }

        // }

        // return isIncluded;
       
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // Count the frequency of characters in s1 and the first window of s2
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // Slide the window over s2
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (matches(s1Count, s2Count)) return true;
            // Update the window
            s2Count[s2.charAt(i) - 'a']--;
            s2Count[s2.charAt(i + s1.length()) - 'a']++;
        }

        // Check the last window
        return matches(s1Count, s2Count);
    }

    private boolean matches(int[] s1Count, int[] s2Count) {
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] != s2Count[i]) return false;
        }
        return true;
   
    }
}