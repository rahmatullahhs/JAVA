
package thread;


public class Thread {

   
    public static void main(String[] args) {
       
        
        System.out.println("Hello");
        try {
            int a, b, c;
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Bogra");
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("how ru?");
        } finally {
            System.out.println("fine");
        }
    }
        
        
    }
   
    
    
    
    
    
    
    
  
