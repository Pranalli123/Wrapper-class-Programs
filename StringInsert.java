/* Java String Program to Insert a String into Another String

Input: originalString = "JavaLanguage", 
            stringToBeInserted = "is", 
            index = 4

Output: "JavaisLanguage" */

import java.util.*;
public class StringInsert
{
 public static void main(String x[])
 {
  Scanner xyz=new Scanner(System.in);
  System.out.println("Enter the original String");
  String str="JavaLanguage";
  String str1="is";
  StringBuilder sb=new StringBuilder(str);
  sb.insert(4,str1);
  System.out.println(sb);
  }
}
