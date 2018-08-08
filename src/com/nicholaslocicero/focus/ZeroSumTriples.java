package com.nicholaslocicero.focus;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ZeroSumTriples {

  public static Set<int[]> zeroSumTriples(int[] data) {
    Set<int[]> answer = new HashSet<>();
    if (data.length < 3) {
      return answer;
    }
    Arrays.sort(data);
    int left, right, target;
    for (int i = 0; i < data.length - 2; i++) {
      if (i > 0 && data[i] == data[i - 1]) {
        continue;
      }
      if (data[i] > 0) {
        break;
      }
      left = i + 1;
      right = data.length - 1;
      while (left < right) {
        target = data[i] + data[left] + data[right];
        if (target == 0) {
          System.out.println("" + data[i] + data[left] + data[right]);
          answer.add(new int[] {data[i], data[left], data[right]});
          while (left < right && data[left] == data[left + 1]) {left++;}
          while (left < right && data[right] == data[right - 1]) {right--;}
        }
        if (target > 0) {
          right--;
        } else {
          left++;
        }
      }
    }
    return answer;
  }

}
