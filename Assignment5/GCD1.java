import java.util.*;
        class Demo{
             public static void main(String[]args){
                  Scanner sc=new Scanner(System.in);
                  System.out.println("Enter first no:");
                  int n1=sc.nextInt();
                  System.out.println("Enter second no:");
                  int n2=sc.nextInt();
                  int gcd=1;
                  while(n1!=0  && n2!=0){
                       if(n1>n2){
                           n1=n1%n2;
                       }
                       else{
                           n2=n2%n1;
                       }
                  }
                  if(n1==0){
                       gcd=n2;
                  }
                  else{
                       gcd=n1;
                  }
                 System.out.println(gcd);
               }
         }