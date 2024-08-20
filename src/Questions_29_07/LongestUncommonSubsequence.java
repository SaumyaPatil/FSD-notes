package Questions_29_07;

public class LongestUncommonSubsequence {

    public static int findLUSlength(String str1, String str2) {
        if (str1.equals(str2)) {
            return 0;
        }
        return Math.max(str1.length(), str2.length());
    }

    public static void main(String[] args) {
        System.out.println(findLUSlength("abcd", "abc")); // 4
        System.out.println(findLUSlength("abc", "abc"));  // 0
    }
}
