class PalindromeNumber {
  public static boolean isPalindrome(int x) {
    int temp = x;
    int rev = 0;
    if (x < 0) {
      return false;
    }
    if (x < 10) {
      return true;
    }
    // Reversing the number
    while (temp != 0) {
      int rem = temp % 10;
      rev = rev * 10 + rem;
      temp = temp / 10;
    }
    if (x == rev) {
      return true;
    }
    return false;
  }

  //Tests
  public static void main(String[] args) {
    System.out.println(isPalindrome(121));
    System.out.println(isPalindrome(-121));
    System.out.println(isPalindrome(10));
  }
}