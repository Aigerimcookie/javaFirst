/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5;

/**
 *
 * @author adeptima
 */
public class Lesson5 {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//      Scanner s = new Scanner (System.in);
//      
//      int a;
//      int b;
//      int c;
//      double x1;
//      double x2;
//      double x;
//      
//      System.out.println("Введите a: ");
//      a = s.nextInt();
//        System.out.println("Введите b:");
//        b = s.nextInt();
//        System.out.println("Введите c:");
//        c = s.nextInt();
//        
//     int d = b*b-4*a*c;
//     
//     if (d > 0){
//         x1 = (-b+Math.sqrt(d))/(2*a);
//         System.out.println("x1="+x1);
//         x2 = (-b-Math.sqrt(d))/(2*a);
//         System.out.println("x2="+x2);
//    }
//     else if (d == 0){
//         x = ((-b)/(2*a));
//         System.out.println("x="+x);
//    }
//     else if (d < 0);
//        System.out.println("Нет");
//}


//    public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++){// цикл for
//             System.out.println("Hello");
//         }
//    }
       
    
//    public static void main(String[] args) {
//        for (int i=5; i>=-5; i--){
//            System.out.println(i);
//        }
//    }
    
//    public static void main(String[] args) {
//        for (int i=1; i<=99; i++){
//            System.out.println(i);
//        }
//    }
    
  
//    public static void main(String[] args) {
//        for (int i=1; i<=99; i++){
//            if (i%2!=0){
//                
//            System.out.println(i);
//        }
//    }
//    }
    
    
//        public static void main(String[] args) {
//        for (int i=1; i<=99; i++){
//            if (i%2==0){
//                
//            System.out.println(i);
//        }
//    }
//    }
    
    
//    public static void main(String[] args) {
//        int f = 1;
//        for (int i = 1; i<5; i++){
//        f = f*i;
//        System.out.println(f);
//    }
//    }
    
    
//    public static void main(String[] args) {
//        int f=1;
//        int i =1;
//        while  (i<5){
//            f=f*i;
//        System.out.println("f="+f);
//        
//        i++;
//    }
    
//    public static void main(String[] args) {
//    int f = 1;
//    int i = 1;
//    do {
//        f=f*i;
//        System.out.println("f= " + f);
//        i++;
//    }
//    while (i<5);
//    }

    
//    public static void main(String[] args) {
//        for (int i= 100; i>0; i--){
//        System.out.println(i);
//        
//    }
//  }
    
//   public static void main(String[] args) {
//        int f = 0;
//       for (int i= 1; i<=5; i++)
//       { f = f +i;
//           System.out.println(f);
//       } 
//  }
    
//    public static void main(String[] args) {
//        int f = 0;
//        int i = 0;
//        while (i<=5){
//            f=f+i;
//            System.out.println(f);
//            i++;
//        }
//    }
    
    
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        Random r1 = new Random ();
//        Random r2 = new Random ();
//        int win = 0;
//        int lose = 0;
//        
//        for (int i=0; i<5; i++){
//            int a = r1.nextInt(20);
//            int b = r2.nextInt(20);
//            
//            System.out.print(a+"-"+b+"=");
//            int res = sc.nextInt();
//            
//            if ((a-b)==res){
//                System.out.println("Great!");
//                win++;
//            }else {
//                System.out.println("Wrong!");
//                lose++;
//            }
//            
//        }
//        System.out.println("Result:"+ "Won:"+win+" "+"Lost:"+lose);
//        
//    }
    
    
//        public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        Random r1 = new Random ();
//        Random r2 = new Random ();
//        int win = 0;
//        int lose = 0;
//        int i = 0;
//        
//        while ( i<5){
//            int a = r1.nextInt(20);
//            int b = r2.nextInt(20);
//            
//            System.out.print(a+"-"+b+"=");
//            int res = sc.nextInt();
//            i++;
//            
//            if ((a-b)==res){
//                System.out.println("Great!");
//                win++;
//            }else {
//                System.out.println("Wrong!");
//                lose++;
//            }
//            
//        }
//        System.out.println("Result:"+ "Won:"+win+" "+"Lost:"+lose);
//        
//    }
    
    
//    public static void main(String[] args) {
//        String s = "";
//        int i, a;
//        for (i = 0; i < 5; i++){
//            s= s+ "*";
//            System.out.println(s);
//        }
//}  
    
//    public static void main(String[] args) {
//        
//        for (int i = 0; i<5; i++){ 
//        for (int j = 0; j<5; j++){
//                if (j<i){ //0<1, 0<2, 0,3... ; 0<2, 1<2, 2!<2...
//            System.out.print(" ");
//        } else{
//        System.out.print("*");
//                              }
//          }System.out.println();
//                      }}

    
           public static void main(String[] args) {
               
               int x = 11;
               int y = 11;
               
        for ( int i = 0; i < 11; i++){
            
           for (int j = 0; j < 11; j++ ){
                
               if (j==11/2-i  ||  j==11/2+i  ||  j==i-11/2  ||  j==11-i+11/2-1)
                    System.out.print("*");
                
                else System.out.print(" ");
            }
            System.out.println();
        }
               System.out.println();
    }
    
  
        
    }

