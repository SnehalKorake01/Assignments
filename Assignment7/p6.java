class Demo{
       public static void main(String[]args){
           int[]arr={1,2,-3,4};
           boolean ans=fun(arr,0);
           System.out.println(ans);
      }
       static boolean fun(int[]arr,int index){
            if(index==arr.length){
                return false;
            }
            if(arr[index]<0){
                return true;
            }
            return fun(arr,index+1);
      }
}