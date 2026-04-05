class Demo{
      public static void main(String[]args){
         int[]arr={2,4,6};
         boolean isEven=true;
         for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
               isEven=false;
               break;
            }
         }
         if(isEven){
              System.out.println("true");
         }
         else{
             System.out.println("false");
         }
       }
}