import java.util.Stack;
import java.util.Scanner;
class implement{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;

        }
    }
    public static class Stack(){
        private Node head=null;
        private int size=0;
        void push(int x){
            Node t=new Node(x);
            t.next=head;
            head=t;
            size++;//[1,2,3]

        }
        int pop(){
            if(head==null){
                return -1;
            }
            int x=head.val;
            head=head.next;
            return x;//[1,2] 3 popped
        }
        int peek(){
            if(head==null){
                return -1;
            }
            return head.val; // 2 
        }
        void displayrec(Node h){
            if(h==null){
                return;
            }
            displayrec(h.next);
            System.out.println(h.val+"");
        }
        void display(){
            displayrec(head);
            System.out.println();

        }
        int size(){
            return size;//2
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
    }
}
    /*public static class stack{
        private int arr[]=new int[5];
        private int idx=0;
        void push(int x){
            if(isFull()){
                return;
            }
            arr[idx]=x;
            idx++;

        }
        int peek(){
            if(idx==0){
             return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.println(arr[i]+"");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        Boolean isEmpty(){
            if(idx==0){
                return true;
            }
            else{
                return false;
            }
        }
        Boolean isFull(){
            if(idx==arr.length){
                return true;
            }
            else{
                return false;
            }
        }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(4);
        //st.display();//[2,3,4]
        System.out.println(st.peek());//4
        System.out.println(st.pop());//4
        System.out.println(st.isEmpty());//false/* */
}
        




        
        
    }
}/* */
