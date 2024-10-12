class MyCircularQueue {
    int q[];
    int f;
    int r;
    int s;
    int c;
    public MyCircularQueue(int k) {
        q=new int[k];
        f=0;
        r=k-1;
        s=0;
        c=k;
        
    }
    public boolean enQueue(int value) {
        if(isFull()) return false;
        r=(r+1)%c;
        q[r]=value;
        s++;
        return true;   
    }
    public boolean deQueue() {
        if(isEmpty()) return false;
        f=(f+1)%c;
        s--;
        return true;     
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return q[f];    
    }
    public int Rear() {
        if(isEmpty()) return -1;
        return q[r];
        
    }
    public boolean isEmpty() {
        return s==0;
    }  
    public boolean isFull() {
        return s==c;
        
    }
}


class MyCircularDeque {
    int dq[];// create a deque
    int f;// front 
    int r;// rear 
    int s;// size 
    int c;// capacity
    public MyCircularDeque(int k) {
        dq=new int[k];// deque of size k
        f=0;// initial front at 0
        r=k-1;// initial rear at last 
        s=0;// initial size 0
        c=k;// initial capacity as k    
    }
    public boolean insertFront(int value) {
        if(isFull()) return false;// overflow
        f=(f-1+c)%c;// insert at front 
        dq[f]=value;
        s++;// size increment
        return true;    
    }
    public boolean insertLast(int value) {
        if(isFull()) return false;// overflow
        r=(r+1)%c;// insert at rear 
        dq[r]=value;
        s++;// size increment
        return true;
        
    }
    public boolean deleteFront() {
        if(isEmpty()) return false;// underflow
        f=(f+1)%c;// delete at front
        s--;// size decrement
        return  true;

    } 
    public boolean deleteLast() {
        if(isEmpty()) return false;// underflow
        r=(r-1+c)%c;// delete at rear
        s--;// size decrement
        return true;
        
    }
    public int getFront() {
        if(isEmpty()) return -1;// underflow
        return dq[f];// get front
        
    } 
    public int getRear() {
        if(isEmpty()) return -1;// underflow
        return dq[r];// get rear 
        
    }  
    public boolean isEmpty() {
        return s==0;// if size 0 means empty deque
        
    }  
    public boolean isFull() {
        return s==c;// if size becomes same as capacity means full deque
    }
}
