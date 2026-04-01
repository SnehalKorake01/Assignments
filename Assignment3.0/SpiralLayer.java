import java.util.*;
         class Demo{
             public static void main(String[]args){
                 Scanner sc=new Scanner(System.in);
                 System.out.println("Enter n:");
                 int n=sc.nextInt();
                 int totalRows=2*n-1;
                 int totalCols=2*n-1;
                 for(int i=1;i<=totalRows;i++){
                      for(int j=1;j<=totalCols;j++){
                          int top=i-1;
                          int bottom=2*n-1-i;
                          int left=j-1;
                          int right=2*n-1-j;
                          int smallestTopBottom=Math.min(top,bottom);
                          int smallestLeftRight=Math.min(left,right);
                          int smallest=Math.min(smallestTopBottom,smallestLeftRight);
                          int layerNo=smallest;
                          System.out.print(n-layerNo+" ");
                       }
                   System.out.println();
                  }
                }
            }
                 