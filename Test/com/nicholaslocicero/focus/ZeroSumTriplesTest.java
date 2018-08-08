package com.nicholaslocicero.focus;

import static com.nicholaslocicero.focus.ZeroSumTriples.zeroSumTriples;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class ZeroSumTriplesTest {

  static final int[][] TEST_INPUT_DATA = {
      {7, 10, 2, -4, -7, 9, -6, -8, 8, 6, -10, -9, 5, 4, -2, -1, -5, 3}
  };

  static int[][] ans = {{7, 2, -9},
      new int[] {7, -6, -1},
          new int[]{7, -10, 3},
          new int[]{7, -2, -5},
          new int[]{10, -4, -6},
          new int[]{10, -8, -2},
          new int[]{10, -9, -1},
          new int[]{2, -7, 5},
          new int[]{2, -6, 4},
          new int[]{2, -8, 6},
          new int[]{2, 8, -10},
          new int[]{2, -5, 3},
          new int[]{-4, 9, -5},
          new int[]{-4, 6, -2},
          new int[]{-4, 5, -1},
          new int[]{-7, 9, -2},
          new int[]{-7, 8, -1},
          new int[]{-7, 4, 3},
          new int[]{9, -8, -1},
          new int[]{-6, 8, -2},
          new int[]{-8, 5, 3},
          new int[]{6, -10, 4},
          new int[]{6, -9, 3},
          new int[]{6, -1, -5},
          new int[]{-9, 5, 4},
          new int[]{-2, -1, 3}};

  @Test
  void testComplimentDNAMethod() {
    Set<int[]> TEST_OUTPUT_DATA = new HashSet(Arrays.asList(ans));
    for (int i = 0; i < TEST_INPUT_DATA.length; i++) {
      System.out.println(zeroSumTriples(TEST_INPUT_DATA[i]));
      assertTrue(zeroSumTriples(TEST_INPUT_DATA[i]).containsAll(TEST_OUTPUT_DATA));
    }
  }

}
