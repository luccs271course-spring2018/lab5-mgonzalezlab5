package edu.luc.cs271.linkedstack;

import java.util.*;

public class ReverseLines {

  public static void main(String[] args) {
    // TODO read successive input lines until EOF, then print out in reverse order

    LinkedStack<Character> stack = new LinkedStack<Character>();

    final Scanner input = new Scanner(System.in);
    String line;
    while ((line = input.nextLine()) != null) {
      System.out.println(line);
      for (int i = 0; i < line.length(); i++) {
        stack.push(line.charAt(i));
      }
      String word = " ";
      for (int i = 0; i < line.length(); i++) {
        word += stack.pop();
      }
      System.out.println(word);
    }
  }
}
