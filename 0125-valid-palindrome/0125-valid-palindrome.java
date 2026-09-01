
        class Solution {

    public boolean isPalindrome(String s) {
         s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return check(s, 0, s.length() - 1);
    }

    public boolean check(String s, int start, int end) {

        // Base Case
        if (start >= end) {
            return true;
        }

        // If characters are not equal
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Call
        return check(s, start + 1, end - 1);
    }
}
    