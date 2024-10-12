import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Reverse_k_element_queue {
 
 static Queue<Integer> queue;
 static void reverseQueueFirstKElements(int k)
  {
    if (queue.isEmpty() == true
      || k > queue.size())
      return;
    if (k <= 0)
      return;

    Stack<Integer> stack = new Stack<Integer>();

    for (int i = 0; i < k; i++) {
      stack.push(queue.peek());
      queue.remove();
    }

    while (!stack.empty()) {
      queue.add(stack.peek());
      stack.pop();
    }

    for (int i = 0; i < queue.size() - k; i++) {
      queue.add(queue.peek());
      queue.remove();
    }
  }

  static void Print()
  {
    while (!queue.isEmpty()) {
      System.out.print(queue.peek() + " ");
      queue.remove();
    }
  }

  public static void main(String args[])
  {
    queue = new LinkedList<Integer>();
    queue.add(5);
    queue.add(10);
    queue.add(15);
    queue.add(20);
    queue.add(25);
    
    int k = 3;
    reverseQueueFirstKElements(k);
    Print();
  }
}
/*class implementation{
    public static class queue{
        int f=-1;
        int r=-1;
        int size=0;
        int arr[]=new int[100];
        public void add(int val){
            if(r==arr.length-1){
                return;
            }
            if(f==-1){
                f=r=0;
                arr[0]=val;
            }
            else{
                arr[++r]=val;
            }
            size++;

        }
        public int remove(){
            if(size==0){
                return -1;
            }
            f++;
            return arr[f-1];
        }
        public int peek(){
            if(size==0){
                return -1;
            }
            return arr[f];
        }
        public void display(){
            if(size==0){
                return;
            }
            else{
                for(int i=f;i<=r;i++){
                    System.out.println(arr[i]+"");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        System.out.println(q.peek());
        q.display();
    }
}
/*class queue{
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

    }
        
    }/* */
