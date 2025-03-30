public class printSSQ {

    static void PrintSSQ(String s, String currAns) {
        // Base case: if the string is empty, print the accumulated subsequence
        if (s.length() == 0) {
            System.out.println(currAns);
            return;
        }

        // Recursive calls: include the first character or exclude it
        char ch = s.charAt(0);
        String remString = s.substring(1);

        // Include the current character in the subsequence
        PrintSSQ(remString, currAns + ch);

        // Exclude the current character from the subsequence
    PrintSSQ(remString, currAns);
    }

    public static void main(String[] args) {
        String s = "abc";
        PrintSSQ(s, ""); // Start with an empty current answer
    }
}

