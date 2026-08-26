class Solution {

    public String shortestBeautifulSubstring(String s, int k) {

        String ans = "";
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {

            int ones = 0;

            for (int j = i; j < s.length(); j++) {

                if (s.charAt(j) == '1') {
                    ones++;
                }

                if (ones == k) {

                    String current = s.substring(i, j + 1);

                    if (current.length() < minLen) {
                        minLen = current.length();
                        ans = current;
                    }
                    else if (current.length() == minLen) {

                        if (current.compareTo(ans) < 0) {
                            ans = current;
                        }
                    }

                    break;
                }
            }
        }

        return ans;
    }
}