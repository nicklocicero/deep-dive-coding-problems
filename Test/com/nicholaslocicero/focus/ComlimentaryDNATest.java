package com.nicholaslocicero.focus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static com.nicholaslocicero.focus.ComplimentaryDNA.complimentaryDNA;

public class ComlimentaryDNATest {

  static final String[][] TEST_DNA_STRANDS = {
      {"ATATGCGC", "TATACGCG"},
      {"GCCTTTAAAATTTCCG", "CGGAAATTTTAAAGGC"},
      {"ATCGATCG", "TAGCTAGC"},
      {"CCCCGGGTTA", "GGGGCCCAAT"}
  };

  @Test
  void testComplimentDNAMethod() {
    for (String[] compliments : TEST_DNA_STRANDS) {
      assertEquals(complimentaryDNA(compliments[0]), compliments[1]);
    }
  }

}
