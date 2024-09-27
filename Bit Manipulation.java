import java.util.Scanner;
public class Bits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int o=sc.nextInt();                 // n=6 0110 1<<0010=0100 if o=0 y=1011&0110=0010=2    if o=1 x=0100|0110=0110=6
        int n=6;
        int p=2;
        int BitMask=1<<p;
        if(o==0){
            int y=~(BitMask);
            int x=y&n;
            System.out.println(x);
        }
        else if(o==1){
            int x=BitMask|n;
            System.out.println(x);
        }
        else{
            System.out.println("invalid");
        }
