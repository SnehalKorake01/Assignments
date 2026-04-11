class Demo{
      public static void main(String[]args){
           int[]arr={1,-2,3,-4,5};
           int ans=fun(arr,0);
           System.out.println(ans);
       }
       static int fun(int[]arr,int index){
            if(index==arr.length){
                return 0;
             }
            int sum=fun(arr,index+1);
            if(arr[index]<0){
   		return arr[index]+sum;
            }
            else{
               return sum;
             }
       }
}