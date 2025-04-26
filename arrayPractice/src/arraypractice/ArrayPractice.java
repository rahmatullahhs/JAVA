package arraypractice;

import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

//        String[] names=new String[14]; (names array)
//        
//        int[]marks=new int[14];
//        
//        int[] ages={10,25,98,45,25,44};
//        
//        System.out.println(Arrays.toString(ages));
//        
//        names[0]="rahmat";
//        
//        System.out.println(Arrays.toString(names));
//        
//       ------------------------- 
//      String[] names={"Rahmat","Easin","Parvaz","Rakib","sadier"};
//      
//        int[]marks={44,55,66,77,88,99};
//        
//        System.out.println("My name is " + Arrays.toString(names).concat(Arrays.toString(marks)));
//        
//        String[] list= new String[5];
//         list[0]="my name is rahmat and mark 22";
//          list[1]="my name is Easin and mark 22";
//           list[2]="my name is Parvaz and mark 22";
//            list[3]="my name is Rakib and mark 22";
//         list[4]="my name is sadier and mark 22";
//        
//         System.out.println(Arrays.toString(list)+ "\n");
//         index=0 but name=1
//         for(int index=0; index<names.length; index++){
//             System.out.println("My name is " + names[index]+ "mark " +marks[index] );
//          System.out.println("Enter count");
//          int n =s.nextInt();
//            String[] names = new String[n];
//            int[] marks = new int[n];
//
//          
//          System.out.println("Enter Name");
//     
//         
//              System.out.println("Enter Marks");
//        int Marks=s.nextInt();
        String[] names = {"Rahmat", "Easin", "Parvaz", "Rakib", "sadier"};

        int[] passwords = {111, 222, 333, 444, 555, 666};

        String userName = s.next();

        for (int i = 0; i < names.length; i++) {

            if (userName.equalsIgnoreCase(names[i])) {

                System.out.println("Enter your password");

                int password;
                password = s.nextInt();
                int index = i;

                if (password == passwords[index]) {
                    System.out.println(" Welcome" + userName);
                } else {
                    System.out.println("Password is incorrect");
                }

            }
            break;
        }

    }

}
