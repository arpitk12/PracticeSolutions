class ReverseInteger{
  public static int reverse(int x){
    char[] xc=new char[Integer.toString(x).length()];
    xc=Integer.toString(x).toCharArray();
    int neg=xc[0]=='-'?1:0;
    for(int i=neg;i<(xc.length+neg)/2;i++){
      char temp=xc[i];
      xc[i]=xc[xc.length-1-i+neg];
      xc[xc.length-1-i+neg]=temp;
    }
    try{
      return Integer.parseInt(new String(xc));
    }catch(Exception e){
      return 0;
    }
  }

  public static void main(String[] args){
    System.out.println(reverse(123));
    System.out.println(reverse(-123));
    System.out.println(reverse(120));
  }
}