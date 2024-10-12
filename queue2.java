class queue{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class queueLL{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int x){
            Node t=new Node(x);
            if(size==0){
                head=tail=t;  
            }
            else{
                tail.next=t;
                tail=t;
            }
            size++; // 1->2->3->4
        }
        public int peek(){
            if(size==0){
                return -1;
            }
            else{
               return head.val;   //1 due to fifo
            }
        }
        public int remove(){
            if(size==0){
                return -1;
            }
            else{
                int x=head.val;
                head=head.next;
                size--;
                return x;  // 2 3 4 now 1 removed
            }
        }
        public void display(){
            if(size==0){
                return;
            }
            Node t=head;
            while(t!=null){
                System.out.println(t.val+"");
                t=t.next;
            }
            System.out.println();// 2 3 4 dsiplayed
        }
    }
    
    public static void main(String[] args) {
        queueLL q=new queueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.peek());
        q.remove();
        q.display();
        
    }
}
