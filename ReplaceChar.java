/* Java String Program to Replace a Character at a Specific Index
Input: str = "JAVA IS FOOD Programming " , index = 8 , ch = 'G'
Output: "JAVA IS GOOD Programming" */

import java.util.*;
public class ReplaceChar
{
 public static void main(String x[])
 {
  String str="JAVA IS FOOD Programming";
  char ch='G';
  int index=8;
  if(index>=0 && index<str.length())
  {
   String result=str.substring(0,index)+ch+str.substring(index+1);
System.out.println(result);
}
 else {
  System.out.println("Invalid index!");
}
}
}

  
