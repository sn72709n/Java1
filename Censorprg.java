
package censor;

public class Censorprg {

   
    public static void main(String[] args) {
        
      
       String result = censor(" kutya nagyon aranyos kutya","kutya","macska");
          System.out.println("próba" + result);
          
    }
   static String censor(String text,String toChange, String newWord)
    {
       text=text.replaceAll(toChange, newWord);
     
         return text;
    }
}


