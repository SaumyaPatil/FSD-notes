package Questions_29_07;

public class SubstringCounter {

    public static int countSubstrings(String S, int X) {
        int count = 0;
        int n = S.length();

        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == '0') {
                continue;
            }
            for (int j = i; j < n; j++) {
                String substring = S.substring(i, j + 1);
                if (Integer.parseInt(substring) > X) {
                    count += 1;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("471", 47));  // 2
        System.out.println(countSubstrings("2222", 97)); // 3
    }
}
