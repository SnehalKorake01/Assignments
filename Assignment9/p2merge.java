import java.util.*;
class Demo {
    public static void main(String[] args) {
        int arr[] = {12,45,1,23,67,90};
        
        f(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        
    }

    static void f(int arr[], int low, int high) {
	
        if(low >= high) {
		return;
	}
        int mid = (low + high) / 2;

           
        f(arr, low, mid);
        f(arr, mid + 1, high);

        merge(arr, low, mid, high);
        
    }

    static void merge(int arr[], int low, int mid, int high) {
        int[] merged = new int[high - low +1]; 

        int blue = low;
        int green = mid +1;
	int red = 0;

        

        while(blue <= mid && green <= high) {
            if(arr[blue] <= arr[green]) {
                merged[red] = arr[blue];
                red++;
		blue++; 
            } 
	    else {
                merged[red] = arr[green];
                red++;
		green++;
            }
            
        }

        
        while(blue <= mid) {
            merged[red] = arr[blue];
            red++;
	    blue++;
        }

        while(green <= high) {
            merged[red] = arr[green];
            red++;
	    green++;
        }

	for(int i = 0; i < merged.length; i++){
		arr[low + i] = merged[i];
	}

    }
}