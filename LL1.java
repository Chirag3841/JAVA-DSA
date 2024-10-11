class LL{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    /*public static Node nthNode(Node head,int n){
        int size=0;
        Node t=head;
        while(t!=null){
            size++;
            t=t.next;
        }fast=fast.ne
        int m=size-n+1;
        t=head;
        for(int i=1;i<=m-1;i++){
            t=t.next;
        }
        return t;
    }/* */
    public static Node nthNode2(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;}
            while(fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(5);
        Node c=new Node(1);
        Node d=new Node(9);
        a.next=b;
        b.next=c;
        c.next=d;
        Node x=nthNode2(a,3);
        System.out.println(x.data);
    }
}
/*class LL{
    public class implementation{
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;

            }
        }
        public static class linkedlist{
            Node head=null;
            Node tail=null;
            int size=0;
           /*void insertt(int val){
                Node t=new Node(val);
                if(head==null){
                    head=t;
                }
                else{
                    tail.next=t;
                }
                tail=t;
                size++; 

            }
            void insertt(Node head,int val){
                Node t=head;
                Node k=new Node(val);
                while(t.next!=null){
                    t=t.next;
                }
                t.next=k;

            }
            void inserth(int val){
                Node t=new Node(val);
                if(head==null){
                    tail=t;
                }
                else{
                    t.next=head;
                }
                head=t;
                size++;
            }
        }
        void insert(int id,int val ){
            Node k=new Node(val);
            Node t=head;
            if(id==size){
                insertt(val);
                return;
            }
            else if(id==0){
                inserth(val);
                return;
            }
            else if(id<0&&id>size){
                System.out.println("wrong");
                return;
            }
            for(int i=1;i<=id-1;i++){
                t=t.next;
            }
            k.next=t.next;
            t.next=k;

        }
        int get(int id){
            Node t=head;
            for(int i=1;i<=id;i++){
                t=t.next;
            }
            t=t.data;
        }
        /*int size(){
            Node t=head;
            int c=0;
            while(t!=null){
                c++;
                t=t.next;
            }
            return c;

        }
        void display(){
            Node t=head;
            while(t!=null){
                System.out.println(t.data+"");
                t=t.next;
            }
        }

    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insertt(3);  //3
        ll.insertt(8);  // 3->8
        ll.insertt(9);   // 3->8->9
        ll.inserth(7);// 7->3->8->9
        System.out.println(ll.size);
        ll.insert(2,5);//7->3->5->8->9
        ll.get(3);   // 8
        ll.insertt(head,10);//7->3->5->8->9->10
        ll.display();

        
    }/* */
    /*public static void display(Node head){
        while(head!=null){
            System.out.println(head.data+"");
            head=head.next;
        }
    }
    public static int length(Node head){
        int c=0;
        while(head!=null){
            c++;            // 5-> 7->  9 ans 3 5 head 9 tail 2 node singular type
            head=head.next;
        }
        return c;
    }
    public  static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args){
        Node x=new Node(5);
        Node y=new Node(7);
        Node z=new Node(9);
        x.next=y;
        y.next=z;
        System.out.println(length(x));
    }/* */
