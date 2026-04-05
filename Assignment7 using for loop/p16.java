class Demo{
      public static void main(String[]args){
         int[]arr={5,2,8,1,3};
         int min=arr[0];
         int store=0;
         for(int i=0;i<arr.length;i++){
             if(arr[i]<min){
               min=arr[i];
               store=i;
              }
          }
         System.out.println(store);
      }
}
       