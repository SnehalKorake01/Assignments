class Demo{
     public static void main(String[]args){
        int[]arr={5,2,3,2,4};
        int target=2;
        int index=-1;
        for(int i=0;i<arr.length;i++){
          if(arr[i]==target){
               index=i;
               break;
           }
         }
         System.out.println(index);
      }
}