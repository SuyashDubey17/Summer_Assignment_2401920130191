import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if(p.length() > s.length()){
            return result;
        }

        int[] freqP = new int[26];
        int[] freqS = new int[26];

        for(int i = 0; i < p.length(); i++){
            freqP[p.charAt(i) - 'a']++;
            freqS[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i <= s.length() - p.length(); i++){

            if(match(freqP, freqS)){
                result.add(i);
            }

            if(i + p.length() < s.length()){
                freqS[s.charAt(i) - 'a']--;
                freqS[s.charAt(i + p.length()) - 'a']++;
            }
        }

        return result;
    }

    public boolean match(int[] a, int[] b){
        for(int i = 0; i < 26; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}
