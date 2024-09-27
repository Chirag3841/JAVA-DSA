// only rough idea
import java.util.Scanner;
public class array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
        

    }
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int num[]=new int[size];              // 1 2 3 4 10/4=2.5
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        float sum=0;
        float avg;

        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
            }
            avg=(sum)/size;
            System.err.println(sum);
            System.out.println(avg);
            }/* */
            }
