import java.util.*;
       class Demo{
            public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter first no:");
                int n1=sc.nextInt();
                System.out.println("Enter Second no:");
                int n2=sc.nextInt();
                int gcd=1;
                for(int i=1;i<=Math.min(n1,n2);i++){
                      if(n1%i==0  &&  n2%i==0){
                            gcd=i;
                       }
                 }
                 System.out.println("Greatest common divisors="+gcd);
             }
        }
