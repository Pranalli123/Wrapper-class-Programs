/* Create a mirror of a string around its center using StringBuilder.
Input: "race" → Output: "raceecar"

Using only StringBuilder, determine if a string is made by repeating a substring.
Input: "abcabcabc" → Output: true (because "abc" is repeated) */

import java.util.*;
public class MirrorString
{
 public static void main(String x[])
 {
  String input="race";
  StringBuilder sb = new StringBuilder(input);

 StringBuilder reversed = new StringBuilder(input).reverse();
 sb.append(reversed);

System.out.println("Mirrored String: " + sb.toString());
}
}
