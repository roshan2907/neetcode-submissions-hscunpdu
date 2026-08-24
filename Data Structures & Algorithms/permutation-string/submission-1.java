class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> set1 = new HashMap<>();

        // Build frequency map for s1
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);

            if (set1.containsKey(c)) {
                set1.put(c, set1.get(c) + 1);
            } else {
                set1.put(c, 1);
            }
        }

        HashMap<Character, Integer> set2 = new HashMap<>();

        int left = 0;
        int right = 0;
        int k = s1.length();

        while (right < s2.length()) {

            // Add right character
            char d = s2.charAt(right);

            if (set2.containsKey(d)) {
                set2.put(d, set2.get(d) + 1);
            } else {
                set2.put(d, 1);
            }

            right++;

            // Only compare when window has k characters
            if (right - left == k) {

                if (matches(set1, set2)) {
                    return true;
                }

                // Remove left character
                char old = s2.charAt(left);

                if (set2.get(old) > 1) {
                    set2.put(old, set2.get(old) - 1);
                } else {
                    set2.remove(old);
                }

                left++;
            }
        }

        return false;
    }

    private boolean matches(HashMap<Character, Integer> set1,
                            HashMap<Character, Integer> set2) {

        return set1.equals(set2);
    }
}