import java.util.*;
class Demo{
        public static void main(String[]args){
           int[]arr={34,12,56,45,23};
           int n=arr.length;
           for(int i=1;i<n;i++){
              int currentElement =arr[i];
              int left=i-1;
              while(left>=0 && arr[left]>currentElement){
                   arr[left+1]=arr[left];
                   left--;
               }
               arr[left+1]=currentElement;
            }
           System.out.println(Arrays.toString(arr));
        }
}