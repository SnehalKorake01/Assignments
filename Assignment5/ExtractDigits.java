import java.util.*;
      class Demo{
           public static void main(String[]args){
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter no:");
               int n=sc.nextInt();
               while(n!=0){
               int rem=n%10;
               System.out.println(rem);
               n=n/10;
               }
           }
       }