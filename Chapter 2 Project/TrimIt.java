public class TrimIt
{
   public static void main(String[] args)
   {
      String sentence1 = "      abc   ";
      String sentence2 = "   def";
      String sentence3 = "ghi         ";
      
      String completeSentence = sentence1.trim() + sentence2.trim() + sentence3.trim();
     
     
      System.out.println(completeSentence);
   }
}