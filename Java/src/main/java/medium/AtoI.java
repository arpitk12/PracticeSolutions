class AtoI{
  public static int myAtoi(String s){
    int n=s.length();
    int i=0;
    int sign=1;
    int res=0;
    while(i<n && s.charAt(i)==' '){
      i++;
    }
    if(i<n && s.charAt(i)=='-'){
      sign=-1;
      i++;
    }else if(i<n && s.charAt(i)=='+'){
      sign=1;
      i++;
    }
    while(i<n && s.charAt(i)>='0' && s.charAt(i)<='9'){
      if(res<214748364 || (res==214748364 && s.charAt(i)<'8')){
        res = res * 10 + s.charAt(i) - '0';
      }
      else{
          return sign==1? Integer.MAX_VALUE : Integer.MIN_VALUE;

      }
      i++;
    }
    return sign*res;
  }

  public static void main(String[] args){
    System.out.println(myAtoi("42"));
    System.out.println(myAtoi("   -42"));
    System.out.println(myAtoi("4193 with words"));
    System.out.println(myAtoi("words and 987"));
    System.out.println(myAtoi("-91283472332"));
    System.out.println(myAtoi("2147483648"));
    
  }
}