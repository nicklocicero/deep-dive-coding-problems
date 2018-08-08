package com.nicholaslocicero.focus;

class ComplimentaryDNA {

  public static String complimentaryDNA(String s) {

    StringBuilder complimentedString = new StringBuilder();

    for (char c : s.toCharArray()) {
      complimentedString.append(complimentSwitch(c));
    }

    return complimentedString.toString();
  }

  private static char complimentSwitch(char c) {
    switch (c) {
      case 'a':
        return 't';
      case 'A':
        return 'T';
      case 't':
        return 'a';
      case 'T':
        return 'A';
      case 'c':
        return 'g';
      case 'C':
        return 'G';
      case 'g':
        return 'c';
      case 'G':
        return 'C';
      default:
        throw new RuntimeException();
    }
  }

}
