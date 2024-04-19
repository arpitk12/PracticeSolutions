import java.util.Arrays;

public class LongestSubstring{
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n == 0) return 0;
        if(n==1) return 1;
        int max = 0;
        int[] map = new int[128];
      
        int start = 0;
        for(int i = 0; i < n; i++){
            int index = s.charAt(i);
            if(map[index] > start){
                start = map[index];
            }
            map[index] = i + 1;
            max = Math.max(max, i - start + 1);
        }
        return max;
    }

    public static void main(String[] args){
      System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}