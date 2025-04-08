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
         
         switch (month) {
            case 1:System.out.println("jan");
             break;
                 case 2:System.out.println("feb");
                  break;
                  case 3:System.out.println("mar");
                   break;
                   case 4:System.out.println("apr");
                    break;
                    case 5:System.out.println("may");
                     break;
                     case 6:System.out.println("jun");
                      break;
                      case 7:System.out.println("jul");
                       break;
                       case 8:System.out.println("aug");
                        break;
                        case 9:System.out.println("sep");
                         break;
                         case 10:System.out.println("oct");
                          break;
                          case 11:System.out.println("nov");
                           break;
                           case 12:System.out.println("Dec");
                break;
            default:
                System.out.println("not a nonth");        
        }
         
         
         
         
         
        System.out.println("enter a date");
          String date=s.next();
                  
                System.out.println(month +" " + date + ","+ year);

                  
                  
                  
                  
                  
                  
    }

}
