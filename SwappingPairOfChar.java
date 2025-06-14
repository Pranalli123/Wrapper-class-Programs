/*/*Add commentMore actions
  	Java String Program to Swapping Pair of Characters
	Input: str = “GIRITECHHUB”
	Output: IGIRETHCUHB
 */

   import java.util.*;
   public class SwappingPairOfChar
   {
     public static void main(String x[])
     {
       Scanner xyz=new Scanner(System.in);
       System.out.println("Enter String ");
       String str=s.nextLine();
       char ch[]=str.toCharArray();
       for(int i=0;i<ch.length-1;i=i+2)
       {
         char temp= ch[i];
         ch[i]=ch[i+1];
         ch[i+1]=temp;
 }
String st=new String(ch);
System.out.println(ch);
}
}
