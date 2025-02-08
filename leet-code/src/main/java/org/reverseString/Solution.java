package org.reverseString;
/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.



Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]*/
public class Solution {
  public void reverseString(char[] s) {
    int left = 0;
    int right = s.length - 1;
    char p;
    while(left < right){
      p = s[right];
      s[right] = s[left];
      s[left] = p;
      left ++;
      right --;
    }
  }
}
