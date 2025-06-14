/* Convert a primitive int value to an Integer object and then convert it back to a primitive. Print all values. */

import java.util.*;
public class IntConversion
{
 public static void main(String x[])
 {
  int primitiveValue=25;
  Integer integerObject = integer.valueOf(primitiveValue);

 int unboxedValue =integerObject.intValue();

System.out.println("primitive int value:" + primitiveValue);
System.out.println("boxed Integer object:" + integerObject);
System.out.println("Unboxed int value:" + unboxedValue);
}
}



  
  
  

