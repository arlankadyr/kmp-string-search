import java.util.ArrayList;
import java.util.List;

public class KMPAlgorithm {
    private static int[] computePrefixFunction(String pattern) {
        int m = pattern.length();
        int[] pi = new int[m];
        pi[0] = 0;
        int k = 0;
        for (int i = 1; i < m; i++) {
            while (k > 0 && pattern.charAt(k) != pattern.charAt(i)) {
                k = pi[k - 1];
            }
            if (pattern.charAt(k) == pattern.charAt(i)) k++;
            pi[i] = k;
        }
        return pi;
    }

    public static List<Integer> search(String text, String pattern) {
        List<Integer> occurrences = new ArrayList<>();
        int n = text.length(), m = pattern.length();
        if (m == 0 || n == 0 || m > n) return occurrences;
        int[] pi = computePrefixFunction(pattern);
        int q = 0;
        for (int i = 0; i < n; i++) {
            while (q > 0 && pattern.charAt(q) != text.charAt(i)) {
                q = pi[q - 1];
            }
            if (pattern.charAt(q) == text.charAt(i)) q++;
            if (q == m) {
                occurrences.add(i - m + 1);
                q = pi[q - 1];
            }
        }
        return occurrences;
    }

    public static void main(String[] args) {
        // Short
        System.out.println(search("ABABCABAB", "ABAB")); // [0, 4]

        // Medium
        String medium = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. ABABACABA in medio.";
        System.out.println(search(medium, "ABABA")); // [51]

        // Long
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) sb.append("ABCABABAC");
        sb.append("ABABACABA");
        String longText = sb.toString();
        List<Integer> res = search(longText, "ABABA");
        System.out.println("Found: " + res.size() + ", first 5: " + res.subList(0, Math.min(5, res.size())));
    }
}