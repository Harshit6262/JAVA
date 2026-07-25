package Operators;

public class PracticeQuestion {
// Question : What will be the output of the following programs

//   (i) public class Test {
//          public static void main(String[] args){
//             int x = 2, y = 5;
//             
//             int exp1 = (x * y / x);
//             int exp2 = (x * (y / x));
//             
//             System.out.println(exp1 + ",");
//             System.out.println(exp2);
//          }
//       }
//        public static void main (String[] args){
//         int x=2, y=5;

//         int exp1 = (x * y / x );
//         int exp2 = (x * (y/x));

//         System.out.print(exp1 + " , ");   // 5
//         System.out.print(exp2);           // 4
        
//         }


//     (ii)  public class Test {
//              public static void main(String[] args){
//                  int x=200, y=50, z =100;
//                  if(x > y && y > z){
//                    System.out.println("Hello");
//                  }
//                  if(z > y  && z < x){
//                   System.out.println("Java");
//                  }
//                  if((y+200) < x && (y+150) < z){
//                  Sysytem.out.println("Hello Java");
//                  }
//              }
//           }
        
        //    public static void main (String[] args){
        //         int x = 200, y = 50, z = 100;
        //         if(x > y && y > z){
        //             System.out.println("Hello");
        //         }
        //         if (z > y && z < x){
        //             System.out.println("Java");
        //         }
        //         if ((y+200) < x && (y+150) < z){
        //             System.out.println("Hello Java");    
        //         }
        //    }
        
//        Output = Java (Yha logical AND lga hai Jab dono statement true hoga tbhi AND kaam karega)

//    (iii)     public class Test {
//                  public static void main(String[] args){
//                      int x, y, z;
//                      x = y = z = 2;
//                      x += y;
//                      y -= z;
//                      z /= (x + y);
//                      System.out.println(x + "" + y + "" + z);
//                  }
//              }
//        public static void main (String[] args){
//         int x, y, z;
//         x = y = z = 2;
//         x += y;      //  x = 4
//         y -= z;      //  y = 0
//         z /= (x + y);  //  z = 0
//         System.out.println(x + "" + y + "" + z);   // 400
//        }

//    (iv)  public class Test {
//              public static void main(String [] args){
//                  int x = 9, y = 12;
//                  int a = 2, b = 4, c = 6;

//                  int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 +a)) / (a + b*y);

//                  System.out.println(exp);
//              }
//          }

      public static void main (String [] args){
        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;

        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a) )/ (a + b*y);
        System.out.println(exp);   // 279
      }

//    (v) public class Test {
//           public static void main (String [] args){
//              x = 10, y = 5;

//              int exp1 = (y * (x / y + x / y));
//              int exp2 = ( y * x / y + y * x / y);

//              System.out.println(exp1);
//              System.out.println(exp2);
//           }
//        }

//      public static void main(String [] args){
//         int x = 10, y = 5;

//         int exp1 = (y * (x / y + x / y));
//         int exp2 = (y * x / y + y * x / y);

//         System.out.println(exp1);   // 20
//         System.out.println(exp2);   // 20
//     }
}
