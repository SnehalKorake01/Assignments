class Demo{
      public static void main(String[]args){
          int[]arr={2,4,5,6,9};
          int k=2;
          int count=0;
          for(int i=0;i<arr.length;i++){
              if(arr[i]%k==0){
                 count++;
              }
           }
          System.out.println(count);
       }
}