class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long minPrefix = 0;
        long maxPrefix = 0;
        long current = 0;

        for (int diff : differences) {
            current += diff;
            minPrefix = Math.min(minPrefix, current);
            maxPrefix = Math.max(maxPrefix, current);
        }

        long minStart = lower - minPrefix;
        long maxStart = upper - maxPrefix;

        long count = maxStart - minStart + 1;
        return (int)Math.max(0, count);                                                                           
    }
}