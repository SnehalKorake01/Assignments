class Demo{
      public static void main(String[]args){
        int[]arr={12,34,5};
        int sum=0;
        for(int i=0;i<arr.length;i++){
           while(arr[i]>0){
               int rem=arr[i]%10;
               sum=sum+rem;
               arr[i]=arr[i]/10;
           }
         }
        System.out.println(sum);
      }
}