class Demo{
       public static void main(String[]args){
          int[]arr={1,2,2,3,2};
          int target=2;
          int ans=fun(arr,0,target);
          System.out.println(ans);
       }
       static int fun(int[]arr,int index,int target){
            if(index==arr.length){
               return 0;
            }
            if(arr[index]==target){
                 return 1+fun(arr,index+1,target);
            }
            else{
                 return fun(arr,index+1,target);
            }
       }
}