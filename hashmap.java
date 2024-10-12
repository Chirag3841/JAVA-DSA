import java.util.*;
class hashmap{
    static class hash<K,V>{
        public static final int DEFAULT_CAPACITY=4;
        public static final float DEFAULT_LOAD_FACTOR=0.75f;// tranverse load=4*0.75=3
        private class Node{
            K key;
            V value;
            Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private LinkedList<Node>[] buckets;
        private void initBuckets(int N){
            buckets=new LinkedList[N];
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
        }
        private int hashfc(K key){
            int hc=key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }
        private int searchInBucket(LinkedList ll ,K key){
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key=key){
                    return i;
                }
            }
            return -1;
        }
        public hash(){
            initBuckets(DEFAULT_CAPACITY);
        }
        public int capacity(){
            return buckets.length;
        }
        public float load(){
            return (n*1.0)/buckets.length;
        }
        private void rehash(){
            LinkedList<Node>[] oldbuckets=buckets;
            initBuckets(oldbuckets.length*2);
            n=0;
            for(var bucket:oldbuckets){
                for(var t:bucket){
                    put(t.key,t.value);
                }

            }
        }
            
        public int size(){
            return n;

        }
        public void put(K key,V value){
            int bi=hashfc(key);
            LinkedList<Node> c=buckets[bi];
            int e=searchInBucket(c,key);
            if(e=-1){
                Node t=new Node(key,value);
                c.add(t);
                n++;
            }
            else{
                Node cn=c.get(e);
                cn.value=value;
            }
            if(n>=buckets.length*DEFAULT_LOAD_FACTOR){
                rehash();
            }

        }
        public V get(K key){
            int bi=hashfc(key);
            LinkedList<Node> c=buckets[bi];
            int e=searchInBucket(c,key);
            if(e!=-1){
                Node cn=c.get(e);
                return cn.value;
            }
            return null;
            

        }
        public V remove(K key){
            int bi=hashfc(key);
            LinkedList<Node> c=buckets[bi];
            int e=searchInBucket(c,key);
            if(e!=-1){
                Node cn=c.get(e);
                V val=cn.value;
                cn.remove(e);
                n--;
                return val;


            }
            return null;


        }




    }
    public static void main(String[] args) {
        Map<String,Integer> m=new HashMap<>();
        System.out.println("Begin");
        m.put("A",1);
        m.put("B",2);
        m.put("C",3);
        m.put("D",4);
        m.put("E",5);
        System.out.println("Testing size"+m.size());
        m.put("C",30);
        System.out.println("Testing size"+m.size());
        System.out.println(m.get("A"));
        System.out.println(m.get("B")); 
        System.out.println(m.get("C"));
        System.out.println(m.get("D"));
        System.out.println(m.remove("C"));
        System.out.println("Testing size"+m.size());
        System.out.println(m.capacity());
        System.out.println(m.load());



        
        
    }
}
/*class hash{ 
}
public static void main(String[] args){
    int a[]={1,2,4,5,1,2,1};// array is given
    Map<Integer,Integer> f=new HashMap<>();// hashmap of array elements and its frequencies .
    for(int e:a){// looping to get array values
        if(!f.containsKey(e)){
            f.put(e,1);// 1 occurence
        }
        else{
            f.put(e,f.get(e)+1);// multiple occurence
        }
    }
    System.out.println(f.entrySet());// print hashmap
    int m=0;// max frequencies
    int k=-1;// answer(value of max occurence)
    for(var i:f.entrySet()){
        if(i.getValue()>m){// 
            m=i.getValue();
            k=i.getKey();// max occurence in key
        }
    }
    System.out.println(k);// 1 3 times
}
/*class hash{
    static void hashmap(){// declare function hashmap
        Map<String,Integer> r=new HashMap<>();// intiliazing a hashmap
        r.put("Aman", 19);
        r.put("Abhinav",18);
        r.put("Divyansh",17);
        System.out.println("Age of Aman is"+" "+r.get("Aman"));
        r.put("Aman", 25);// update age of aman
        r.remove("Abhinav");// remove abhinav's record
        System.out.println(r.putIfAbsent("Nishit",18));// adding new record of nishit
        System.out.println("Age of Nishit is"+" "+r.get("Nishit"));
        System.out.println(r.containsKey("Aman"));// check existance of aman's record
        System.out.println("Age of Aman is"+" "+r.get("Aman"));
        System.out.println("Age of Abhinav is"+" "+r.get("Abhinav"));
        System.out.println(r.keySet());// return all keys of record
        System.out.println(r.values());// return all values of record
        System.out.println(r.entrySet());// return value key pair of record
        for(var a:r.entrySet()){// traverse hashmap 
            System.out.print(a.getKey()+" ");// get key
            System.out.print(a.getValue()+" ");// get value 

        }

    }
    public static void main(String[] args) {
        hashmap();//  calling function
        
    }
}/* */
