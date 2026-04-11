class Demo{
       public static void main(String[]args){
          int[]arr={10,20,30,40,50};
          int ans=fun(arr,0);
          System.out.println(ans);
       }
        static int fun(int[]arr,int index){
             if(index==arr.length){
                 return 0;
             }
             if(index%2!=0){
                  return arr[index]+fun(arr,index+1);
             }
             else{
                  return fun(arr,index+1);
             }
         }
}