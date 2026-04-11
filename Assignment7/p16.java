class Demo{
       public static void main(String[]args){
           int[]arr={5,2,8,1,3};
           int ans=fun(arr,0);
           System.out.println(ans);
       }
       static int fun(int[]arr,int index){
              if(index==arr.length-1){
                  return index;
              }
              int minIndex=fun(arr,index+1);
              if(arr[index]<arr[minIndex]){
                 return index;
              }
              else{
                 return minIndex;
              }
         }
}