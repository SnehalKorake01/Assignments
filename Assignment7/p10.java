class Demo{
      public static void main(String[]args){
            int[]arr={1,2,3,2,1};
            boolean ans=fun(arr,0);
            System.out.println(ans);
      }
      static boolean fun(int[]arr,int index){
             if(index==arr.length/2){
                return true;
             }
             if(arr[index]!=arr[arr.length-1-index]){
                 return false;
             }
             return fun(arr,index+1);
       }
}