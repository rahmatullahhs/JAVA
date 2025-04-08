package javaapplication19;

import java.util.Scanner;

public class JavaApplication19 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

//        System.out.println("input your name");
//
//        String name = s.next();
//        
//        System.out.println(name.concat(" ")+ "progammer");
               
         System.out.println("enter a year");
          String year = s.next();
          
         System.out.println("enter a Month");
         int month =s.nextInt();
         
         switch (var) {
             case a:
                
                break;
            default:
                throw new AssertionError();
        }
         
         
         
         String ans="   ";
         switch (month) {
            case 1 :ans="jan";
             break;
                 case 2:ans="fab";
                  break;
                  case 3:ans="mar";
                   break;
                   case 4:ans="apr";
                    break;
                    case 5:ans="may";
                     break;
                     case 6:ans="jun";
                      break;
                      case 7:ans="jul";
                       break;
                       case 8:ans="aug";
                        break;
                        case 9:ans="sep";
                         break;
                         case 10:ans="oct";
                          break;
                          case 11:ans="nov";
                           break;
                           case 12:ans="dec";
                break;
            default:
                System.out.println("not a nonth");        
        } 
        System.out.println("enter a date");
          String date=s.next();
                  
                System.out.println(ans +" " + date + ","+ year);

                  
                  
                  
                  
                  
                  
    }

}
