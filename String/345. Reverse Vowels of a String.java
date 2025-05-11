class Solution {
    public String reverseVowels(String s) {
        int low = 0;
        int high = s.length() - 1;
        char[] ch = s.toCharArray();
        while (low < high) {
            if (!isVowel(ch[low])) {
                low++;
            } else if (!isVowel(ch[high])) {
                high--;
            } else {
                char temp = ch[low];
                ch[low] = ch[high];
                ch[high] = temp;
                low++;
                high--;
            }
        }
        return new String(ch);
    }

    public boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
}
