package org.leetcode.binarysearch;

public class Solution {
  public static void main(String[] args) {
    int nums[] = {-1,0,3,5,9,12};
    System.out.println(search(nums, 12));
  }

  public static int search(int[] nums, int target) {
    int m, l, r;
    l = 0;
    r = nums.length - 1;
    while (l <= r) {
      m = l + (r - l) / 2;
      if (nums[m] < target) {
        l = m + 1;
      } else if (nums[m] > target) {
        r = m - 1;
      } else {
        return m;
      }
    }
    return -1;
  }
}
