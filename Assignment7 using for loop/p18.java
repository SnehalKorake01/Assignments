class Demo{
     public static void main(String[]args){
         int[]arr={1,2,3,4};
         boolean isUnique=true;
         for(int i=0;i<arr.length;i++){
            int count=0;
              for(int j=0;j<arr.length;j++){
                 if(arr[i]==arr[j]){
                   count++;
                  }
                  if(count==2){
                    isUnique=false;
                       break;
                  }
            }
              if(!isUnique){
                  System.out.println("false");
                  break;
              }
           }
           if(isUnique){
                   System.out.println("true");
           }
       }
}
  
