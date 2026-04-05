class Demo{
     public static void main(String[]args){
         int[]arr={10,5,8,20,15};
         for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
              if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
             }
           }
        }  
         int secondMaximum=arr[arr.length-2];
         System.out.println(secondMaximum);
      }
}           