class Demo{
    public static void main(String[]args){
       int[]arr={1,2,3,2,1};
       boolean isPalindrome=true;
       int mid=arr.length/2;
       for(int i=0;i<=mid;i++){
           if(arr[i]!=arr[arr.length-1-i]){
                 isPalindrome=false;
                 break;
            }
      }
      if(isPalindrome){
            System.out.println("true");
       }
       else{
            System.out.println("false");
       }
     }
}