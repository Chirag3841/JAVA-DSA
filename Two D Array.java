// rough
import java.util.Scanner;
public class twoarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int a[][]={{1,2},{3,5}};
            int b[][]={{2,3},{1,0}};
            int c[][]=new int[2][2];
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    c[i][j]=a[i][j]-b[i][j];
                    System.out.println(c[i][j]+" ");
                }

            }
            System.out.println();
        }
        /*Scanner sc=new Scanner(System.in);
        int a[][]={{1,2},{4,5}};
        int b[][]={{3,6},{7,8}};
        int d[][]=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){             // suppose r=2 and c=2 so let a[2][2]={1,2,3,4}
                d[i][j]=a[i][j]+b[i][j];
                System.out.println(d[i][j]+"");
                   // now if s=3 then a[2][1]=3 rhen found 
            }
            System.out.println();
        }/* */
        // int s=sc.nextInt();
         //for(int i=0;i<r;i++){
           // for(int j=0;j<c;j++){
               // System.out.println(d[i][j]);
                //if(a[i][j]==s){
                    //System.out.println("found");
                //}
                //else{
                    //System.out.println("not found");
                }

