class Solution {

    
    private String[] splitWords(String sentence) {
        return sentence.split(" ");
    }

    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        // Split both sentences into arrays of words
        String[] words1 = splitWords(sentence1);
        String[] words2 = splitWords(sentence2);

        // Ensure words1 is the longer sentence
        if (words1.length < words2.length) {
            String[] temp = words1;
            words1 = words2;
            words2 = temp;
        }

        int start = 0, end = 0;
        int n1 = words1.length, n2 = words2.length;

        // Compare from the start
        while (start < n2 && words1[start].equals(words2[start])) {
            start++;
        }

        // Compare from the end
        while (end < n2 && words1[n1 - end - 1].equals(words2[n2 - end - 1])) {
            end++;
        }

        // Check if the remaining unmatched part is in the middle
        return start + end >= n2;
    }
}
/*
Note: Example of .split() method in Java
String sentence = "Hello world this is Java";
String[] words = sentence.split(" ");

for (String word : words) {
    System.out.println(word);
}

String csv = "apple,banana,orange,grape";
String[] fruits = csv.split(",");

for (String fruit : fruits) {
    System.out.println(fruit);
}
String mixed = "apple, banana; orange grape";
String[] items = mixed.split("[,; ]");

for (String item : items) {
    System.out.println(item);
}
String sentence = "one two three four five";
String[] parts = sentence.split(" ", 3); // Split into 3 parts

for (String part : parts) {
    System.out.println(part);
}
 */