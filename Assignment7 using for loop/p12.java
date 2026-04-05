class Demo{
      public static void main(String[]args){
         int[]arr={1,2,3,3};
         boolean isIncreasing=true;
          for(int i=0;i<arr.length-1;i++){
             if(arr[i]>=arr[i+1]){
                   isIncreasing=false;
                   break;
             } 
          }
          if(isIncreasing){
               System.out.println("true");
          }
          else{
               System.out.println("false");
          }
       }
}