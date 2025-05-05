
package javaapplication69;


public class JavaApplication69 {

 
    public static void main(String[] args) {
        
        String text = null;

        try {
            System.out.println("Text length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
        
    
    

