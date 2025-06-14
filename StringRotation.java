/* Rotate a string to the right by k positions using StringBuffer.
Input: "abcdef", k = 2 → Output: "efabcd" */

import java.util.*;
public class StringRotation
{
  public static void main(String x[])
  {
   String input ="abcdef";
   int k =2;

 
 String rotated = rotateRight(input,k);
 System.out.println("Rotated String: " + rotated);
}

public static String rotateRight(String str,int k)
{
  int len = str.length();
  k = k % len;

 StringBuffer sb = new StringBuffer();

sb.append(Str.substring(len -k));

sb.append(str.substring(0,len -k));

return sb.toString();
}
}
