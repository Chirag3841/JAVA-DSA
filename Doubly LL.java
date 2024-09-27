class doublyLL{
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){
        Node t=head;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;                       // 4->5->7
            
        }
        System.out.println();
    }
    public static void display2(Node tail){
        Node t=tail;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.prev;             // 7->5->4 
        }
        System.out.println();
    }
    public static void displayr(Node random){
        Node t=random;
        while(t.prev!=null){  
            t=t.prev;
        }
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;                      
            
        }
        System.out.println();

    }
    public static Node inserth(Node head,int data){ // 4 5 7 
        Node p=new Node(6);   
        p.next=head;             
        head.prev=p;         // 6 4 5 7       
        head=p;
        return head;
    }
    public static void insertt(Node head,int data){
        Node t=head;                                                                 
        while(t.next!=null){                         
            t=t.next;                               
        }
        Node p=new Node(9);   // 6 4 5 7 9  
        t.next=p;
        p.prev=t;     
    }
    public static void insert(Node head,int id,int data){
        Node s=head;
        for(int i=1;i<=id-1;i++){
            s=s.next;
        }
        Node r=s.next;
        Node p=new Node(8);
        s.next=p;
        p.prev=s;
        p.next=r;               // 6 4 5 8 7 9  
        r.prev=p;
    }
    public static void main(String[] args) {
        Node x=new Node(4);
        Node y=new Node(5);
        Node z=new Node(7);
        x.next=y;
        y.prev=x;
        y.next=z;
        z.prev=y;
        display(x);
        display2(z);
        displayr(y);
        Node newhead=inserth(x,6);
        insertt(x,8);
        insert(x,3,8);
        display(x);
        display(newhead);
        
    }
}
