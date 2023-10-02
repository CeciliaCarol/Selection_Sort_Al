package Algoritmo;


public class Selection {
    public static void selection(int[] arr) {
    	int n = arr.length;
    	
    	for (int i = 0; i < n - 1; i++) {
    		int minIndex = i;
    		
    		for(int j = i + 1; j < n; j++ ) {
    			if (arr[j] < arr[minIndex]) {
    				minIndex = j;
    			}
    		}
    		
    		int temp = arr[minIndex];
    		arr[minIndex] = arr[i];
    		arr[i] = temp;
    	}
    }
    
    public static void main(String[] args) {
    	int[] arr = {7, 20, 45, 8, 78, 6};
    	
    	System.out.println("Array antes da ordenação:");
    	printArray(arr);
    	
    	selection(arr);
    	
    	System.out.println("\nArray após a ordenação:");
    	printArray(arr);
    }

    public static void printArray(int[] arr) {
    	for (int num : arr) {
    		System.out.println(num + " ");
    	}
    	System.out.println();
    }
}
