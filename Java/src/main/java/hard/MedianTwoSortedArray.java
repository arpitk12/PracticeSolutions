class MedianTwoSortedArray {
  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int m, n;
    m = nums1.length;
    n = nums2.length;
    int i;
    if ((m + n) % 2 == 0) {
      i = (m + n) / 2 - 1;
    } else {
      i = (m + n) / 2;
    }
    int s1 = 0, s2 = 0, s = 0;
    int[] nums = new int[m + n];
    while (s <= i + 1) {
      if (s1 < m && (s2 == n || nums1[s1] < nums2[s2])) {
        nums[s] = nums1[s1];
        s1++;
      } else if (s2 < n) {
        nums[s] = nums2[s2];
        s2++;
      }
      s++;
    }
    if ((m + n) % 2 == 0) {
      return ((double) (nums[i] + nums[i + 1])) / 2;
    } else {
      return nums[i];
    }
  }
  public static void main(String[] args){
    System.out.println(findMedianSortedArrays(new int[]{1,3},new int[]{2}));
    System.out.println(findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));
  }
}