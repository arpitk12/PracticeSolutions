class LongestPalindromic
  {
    public static String longestPalindrome(String s) {
      int n = s.length();
      if (n < 2)
        return s;
      int max = 0;
      String longest = "";
      for(int i=0;i<n;i++){
        String s1=expand(s,i,i);
        if(s1.length()>max){
          longest=s1;
          max=s1.length();
        }
        String s2=expand(s,i,i+1);
        if(s2.length()>max){
          longest=s2;
          max=s2.length();
        } 
      }
      return longest;
    }

    public static String expand(String s, int i, int j){
      while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
        i--;
        j++;
      }
      return s.substring(i+1,j);
    }

    public static void main(String[] args) {
      System.out.println(longestPalindrome("babad"));
      System.out.println(longestPalindrome("cbbd"));
      System.out.println(longestPalindrome("a"));
      System.out.println(longestPalindrome("ac"));
    }
  }