package LongestCommonPrefix;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int minLength = 0;

        for (String str : strs) {
            if (minLength == 0 || str.length() < minLength) {
                minLength = str.length();
            }
        }

        while (minLength > 0) {
            String prefix;
            try {
                prefix = strs[0].substring(0, minLength);
            } catch (StringIndexOutOfBoundsException e) {
                minLength--;
                continue;
            }
            boolean isCommonPrefix = true;
            for (String str : strs) {
                if (!str.startsWith(prefix)) {
                    isCommonPrefix = false;
                    break;
                }
            }
            if (isCommonPrefix) {
                return prefix;
            }
            minLength--;
        }
        return "";
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        // String[] strs = {"flower", "flow", "flight"};
        String[] strs = {"","b"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
    }
}
