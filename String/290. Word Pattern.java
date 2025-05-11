class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        HashMap<Character,String> hm = new HashMap<>();
        if(pattern.length() != arr.length) return false;
        for(int i = 0 ; i < pattern.length() ; i++){
            char c = pattern.charAt(i);
            boolean containsKey = hm.containsKey(c);
            if(!containsKey && hm.containsValue(arr[i])){
                return false;
            }
            if(containsKey && !hm.get(c).equals(arr[i])){
                return false; 
            }
            else{
                hm.put(c,arr[i]);
            }
        }
        return true;
    }
}
