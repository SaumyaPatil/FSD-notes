package Questions_29_07;

public class ConcatenationCheck {

    public static String canGenerateString(String str, String A, String B) {
        if (str.equals(A + B) || str.equals(B + A)) {
            return "Yes";
        }
        return "No";
    }

    public static void main(String[] args) {
        System.out.println(canGenerateString("GeeksforGeeks", "Geeksfo", "rGeeks")); // Yes
        System.out.println(canGenerateString("Delhicapitals", "Delmi", "capitals")); // No
    }
}
