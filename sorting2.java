import java.util.Scanner;
public class Main
{
	public static void divide(int arr[],int si,int ei) {
		if(si>=ei){       //   si start ,ei end mid middle if si>e1 no return 
		    return;
	    }
	    int mid =(si+ei)/2;    // mid = si+(ei-si)/2 or (si+ei)/2
	    divide(arr,si,mid);
	    divide(arr,mid+1,ei);
	    conquer(arr,si,mid,ei);
    }
    public static void main (String args[]){
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        divide(arr,0,n-1);  
        for (int i=0;i<n ;i++ ){
            System.out.print(arr[i]+" ");
        }
    }
    public static void conquer(int arr[],int si,int mid,int ei){
        int merged[]=new int [ei-si+1];      //  639258  63 9 25 8 
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while(idx1<= mid && idx2<=ei){
            if(arr[idx1] <= arr[idx2]) {

                merged [x++] = arr[idx1++];
            }  else{
                merged [x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid) {
         merged [x++] = arr[idx1++];
        }
        while(idx2 <= ei) {
            merged [x++] = arr[idx2++];
        }
        for(int i=0, j=si; i<merged.length; i++,j++){
            arr[j] = merged [i];
        }
    }
}

import java.util.Scanner;
public class QuickSort {

    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pivotIndex = partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);  //639528 6352 9  635 63 259 235689

        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j < high; j++) {
            if(arr[j] < pivot){
                i++;
                //now perform swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap with pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i; //pivot index
    }

    public static void main(String[] args){
        int[] arr ={6,3,9,5,2,8};
        int n=arr.length;
        quickSort(arr,0,n-1);
        
        //print the array
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
