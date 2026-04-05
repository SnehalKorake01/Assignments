class Demo{
       public static void main(String[]args){
          int[]arr={1,2,-3,4};
          boolean isNegative=false;
          for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
               isNegative=true;
               break;
            }
         }
         if(isNegative){
             System.out.println("true");
         }
         else{
             System.out.println("false");
         }
       }
 }