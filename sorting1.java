import java.util.Scanner;
public class sorting{
    public static void Is(int arr[]){
        for(int i=0;i<arr.length;i++){    // 5 4 2 3 1 length=5 {5,4,2,3,1} unsorted array
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){  // 5 4 3 2 1 
        int arr[]={5,4,2,3,1};
        for(int i=1;i<arr.length;i++){
            int t=arr[i];              // 34521 23451 12345 ans
            int j=i-1;
            while(j>=0&&t<arr[j]){
            arr[j+1]=arr[j];
            j--;}
            arr[j+1]=t;
        }
        Is(arr);
       /*  for(int i=0;i<arr.length-1;i++){
            int s=i;
            for(int j=i+1;j<arr.length;j++){  // 1 4 3 2 5 1 2 3 4 5 ans 
                if(arr[j]<arr[s]){
                    s=j;
                }
            }
            int t=arr[s];
            arr[s]=arr[i];
            arr[i]=t;
        }
        ss(arr);/* 
  
        /*for(int i=0;i<arr.length-1;i++){   // 
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){             // 5 4 2 3 1 * 4 5 2 3 1 42531 42351 42315 24315 23415 23145 21345 12345 ans 
                    int t=arr[j];                // bubble sort means adjacent swapping between two consecutive elements
                    arr[j]=arr[j+1];
                    arr[j+1]=t;/* */

                    
                }

            }
        //}
        //bs(arr);
   // }
