class Demo{
          public static void main(String[]args){
              int[]arr={1,5,3,7,2};
              int x=3;
              int ans=fun(arr,0,x);
              System.out.println(ans);
          }
           static int fun(int[]arr,int index,int x){
              if(index==arr.length){
                  return 0;
              }
              if(arr[index]>x){
                  return 1+fun(arr,index+1,x);
              }
              else{
                  return fun(arr,index+1,x);
              }
           }
}