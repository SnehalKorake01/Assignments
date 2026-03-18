import java.util.*;
      class Demo{
           public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter no:");
                int n=sc.nextInt();
                 int temp=1;
                for(int i=1;i<=n;i++){
                       int count=0;
                      for(int j=1;j<=temp;j++){
                           if(temp%j==0){
                               count++;
                            }
                       }
                      if(count==2){
                       System.out.print(temp+" ");
                   }
                   temp++;
                 }
                  
            }
       }



