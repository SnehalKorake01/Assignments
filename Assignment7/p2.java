class Demo{
        public static void main(String[]args){
            int[]arr={5,2,3,2,4};
            int target=2;
            int ans=fun(arr,arr.length-1,target);
            System.out.println(ans);
        }
        static int fun(int[]arr,int index,int target){
             if(index==0){
                 return -1;
             }
             if(arr[index]==target){
                return index;
             }
             return fun(arr,index-1,target);
          }
}