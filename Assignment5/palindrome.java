import java.util.*;
         class Demo{
              public static void main(String[]args){
                  Scanner sc=new Scanner(System.in);
                  System.out.println("Enter no:");
                  int n=sc.nextInt();
                  int store=n;
                  int rev=0;
                  while(n!=0){
                     int rem=n%10;
                     rev=rev*10+rem;
                     n=n/10;
                  }
                  if(store==rev){
                     System.out.println("Palindrome");
                  }
                  else{
                     System.out.println("Not palindrome");
                  }
              }
           }