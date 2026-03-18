import java.util.*;
       class Demo{
             public static void main(String[]args){
                 Scanner sc=new Scanner(System.in);
                 System.out.println("Enter no:");
                 int n=sc.nextInt();
                 int store=n;
                 int sum=0;
                 while(n!=0){
                     int rem=n%10;
                     sum=sum+rem*rem*rem;
                     n=n/10;
                 }
                 if(store==sum){
                     System.out.println("Armstrong number");
                 }
                 else{
                     System.out.println("Not Armstrong");
                 }
              }
        }