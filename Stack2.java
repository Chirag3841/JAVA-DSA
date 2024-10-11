import java.util.*;
class pretoinfix{
    public static void main(String[] args) {
        String str="-9/*+5346";
        Stack<String>val=new Stack<>();
        for(int i=str.length()-1;i>=0;i--){//  str
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ch+"");
            }
            else{
                String v1=val.pop();// first v2 popped to perform postfix.
                String v2=val.pop();
                char op=ch;
                String t="("+v1+op+v2+")";
                val.push(t);
            }

        }
        System.out.println(val.peek());

    }
}
/*class posttopre{
    public static void main(String[] args) {
        String str="953+4*6/-";// postfix
        Stack<String>val=new Stack<>();
        for(int i=0;i<str.length();i++){//  str
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ch+"");
            }
            else{
                String v2=val.pop();// first v2 popped to perform postfix.
                String v1=val.pop();
                char op=ch;
                String t=op+v1+v2;
                val.push(t);
            }

        }
        System.out.println(val.peek());

    }
}
/*class prefix{
    public static void main(String[] args) {
        String str="-9/*+5346";// prefix
        Stack<Integer>val=new Stack<>();
        for(int i=str.length()-1;i>=0;i--){// reverse str
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }
            else{
                int v1=val.pop();// first v1 popped to perform prefix.
                int v2=val.pop();
                if(ch=='+'){
                    val.push(v1+v2);
                }
                else if (ch=='-'){
                    val.push(v1-v2);
                }
                else if (ch=='*'){
                    val.push(v1*v2);
                }
                else if (ch=='/'){
                    val.push(v1/v2);
                }
            }

        }
        System.out.println(val.peek());// ans=4

    }
}/* */
/*class postix{
    public static void main(String[] args) {
        String str="953+4*6/-";// postfix
       c/* */
/*class prefix{
    public static void main(String[] args) {
        String str="9-(5+3)*3/6";// 9-8*3/6 9-24/6 9-4 5 ans
        Stack<String>val=new Stack<>();
        Stack<Character>op=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){//48-0 and 57-9
                String s=""+ch;
                val.push(s);
            }
            else if(op.size()==0 || ch=='('|| op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=op.pop();
                    String t=v1+v2+o;
                    val.push(t);
                }
                op.pop();
            }
            else{
                if(ch=='+'||ch=='-'){
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=op.pop();
                    String t=v1+v2+o;
                    val.push(t);
                    op.push(ch);   
                }
                if(ch=='*'||ch=='/'){
                    if(op.peek()=='*'||op.peek()=='/'){
                        String v2=val.pop();
                        String v1=val.pop();
                        char o=op.pop();
                        String t=v1+v2+o;
                        val.push(t); 
                        op.push(ch);  

                    }
                    else{
                        op.push(ch);
                    }
                }

            }

        }
        while(val.size()>1){
            String v2=val.pop();
            String v1=val.pop();
            char o=op.pop();
            String t=v1+v2+o;
            val.push(t); 

        }
        String prefix=val.pop();
        System.out.println(prefix);
    }
}
/*class infix{
    public static void main(String[] args) {
        String str="9-(5+3)*3/6";// 9-8*3/6 9-24/6 9-4 5 ans
        Stack<Integer>val=new Stack<>();
        Stack<Character>op=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){//48-0 and 57-9
                val.push(ascii-48);
            }
            else if(op.size()==0 || ch=='('|| op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                    int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='+'){
                        val.push(v1+v2);
                    }
                    else if (op.peek()=='-'){
                        val.push(v1-v2);
                    }
                    else if (op.peek()=='*'){
                        val.push(v1*v2);
                    }
                    else if (op.peek()=='/'){
                        val.push(v1/v2);
                    }
                    op.pop();
                }
                op.pop();
            }
            else{
                if(ch=='+'||ch=='-'){
                    int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='+'){
                        val.push(v1+v2);//add
                    }
                    else if (op.peek()=='-'){//subtract
                        val.push(v1-v2);
                    }
                    op.pop();
                    op.push(ch);   
                }
                if(ch=='*'||ch=='/'){
                    if(op.peek()=='*'||op.peek()=='/'){
                        int v2=val.pop();
                        int v1=val.pop();
                        if (op.peek()=='*'){//multiply
                            val.push(v1*v2);
                        }
                        else if (op.peek()=='/'){//divide
                            val.push(v1/v2);
                        }
                        op.pop();
                        op.push(ch);  

                    }
                    else{
                        op.push(ch);
                    }
                }

            }

        }
        while(val.size()>1){
            int v2=val.pop();
            int v1=val.pop();
            if(op.peek()=='+'){
                val.push(v1+v2);
            }
            else if (op.peek()=='-'){
                val.push(v1-v2);
            }
            else if (op.peek()=='*'){
                val.push(v1*v2);
            }
            else if (op.peek()=='/'){
                val.push(v1/v2);
            }
            op.pop();

        }
        System.out.println(val.peek());
    }
}/* */
