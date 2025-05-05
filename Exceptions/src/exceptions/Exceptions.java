
package exceptions;


public class Exceptions {

 
    public static void main(String[] args) {
       
        
      String text = null;

        try {
            System.out.println("Text length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }

     
    }
}  
       
