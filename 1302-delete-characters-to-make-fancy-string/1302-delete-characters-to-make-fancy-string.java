class Solution {
    public String makeFancyString(String s) {
        // if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)) {
        //     s = s.substring(1, s.length());
        // }
        // if (s.charAt(s.length() - 3) == s.charAt(s.length() - 2)
        //         && s.charAt(s.length() - 2) == s.charAt(s.length() - 1)) {
        //     s = s.substring(s.length() - 1, s.length());
        // }
        StringBuilder str=new StringBuilder(s);
        for (int i = 1; i < str.length()-1; i++) {
            if (str.charAt(i-1) == str.charAt(i) && str.charAt(i) == str.charAt(i+1)) {
            // s = s.substring(0, i)+s.substring(i+1,s.length());
            str=str.deleteCharAt(i);
            i--;
        }
        }
        return str.toString();
    }
}