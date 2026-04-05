class Demo{
       public static void main(String[]args){
          int[]arr={9,7,5,2};
          boolean isDecreasing=true;
          for(int i=0;i<arr.length-1;i++){
             if(arr[i]<=arr[i+1]){
                 isDecreasing=false;
                 break;
             }
          }
          if(isDecreasing){
             System.out.println("true");
          }
          else{
             System.out.println("false");
          }
       }
}