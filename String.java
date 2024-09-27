import java.util.Scanner;
public class Strings{
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        String email=a.next();
        String name="";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else{                       //abcd26999@gmail.com 
                name+=email.charAt(i);
            }
        }
        System.out.println(name);


        }

        
    }
