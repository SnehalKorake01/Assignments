class Demo{
        public static void main(String[]args){
           int[]arr={2,4,5,6,9};
           int k=2;
           int ans=fun(arr,0,k);
           System.out.println(ans);
        }
        static int fun(int[]arr,int index,int k){
             if(index==arr.length){
                return 0;
             }
             int count=fun(arr,index+1,k);
             if(arr[index]%k==0){
                 return 1+count;
             }
             else{
                 return count;
             }
         }
}