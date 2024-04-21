import java.util.Scanner;

public class HeapSort {
    Scanner scan = new Scanner(System.in);
    int arr[] = new int[50];
    int length = 0;
    
    HeapSort() {
        System.out.println("Enter number of elements: ");
        length = scan.nextInt();
        System.out.println("Enter elements of array: ");
        for(int i=0; i<length;i++) 
        arr[i] = scan.nextInt();
        Heap(arr);
        System.out.println("Sorted array: ");
        for(int i=0; i<length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    void Heap(int array[]) {
        for(int i= length/2 - 1; i>= 0; i--) 
        Heapify(array, length, i);
        
        for(int i= length-1; i>0 ;i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
        
            Heapify(array, i, 0);
        }
    
    }
    
    void Heapify (int array[], int length, int i) {
        //max is largest value between parent and children, i is the parent index.
        int max = i;
        int left = 2*i +1;
        int right = 2*i +2;
    
        if(left < length && array[left] > array[max])
        max = left;
    
        if(right < length && array[right] > array[max])
        max = right;
    
        if(max != i) {
            int swap = array[i];
                array[i] = array[max];
                array[max] = swap;
            
            Heapify(array, length, max);
        }
    
    }


}
