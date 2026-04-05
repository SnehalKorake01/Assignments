class Demo{
      public static void main(String[]args){
          int[]arr={1,5,3,7,2};
          int x=3;
          int count=0;
          for(int i=0;i<arr.length;i++){
             if(arr[i]>x){
               count++;
             }
          }
          System.out.println(count);
       }
}