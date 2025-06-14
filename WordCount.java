import java.util.*;
public class WordCount
{
  public static void main(String x[])
  {
    String input="hello world";

  String[] words=input.trim().split("\\s+");
  int wordcount = words.length;

 System.out.println("Number of words:" + wordCount);
}
}
