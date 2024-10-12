import java.util.*;
class BT2{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BT{
        static int idx=-1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1) return null;
            Node x=new Node(nodes[idx]);
            x.left=buildtree(nodes);
            x.right=buildtree(nodes);
            return x;
        }
    }
    public static int cn(Node root){
        if(root==null) return 0;
        int l=cn(root.left);
        int r=cn(root.right);
        return l+r+1;

    }
    public static int sn(Node root){
        if(root==null) return 0;
        int sl=sn(root.left);
        int sr=sn(root.right);
        return sl+sr+root.data;
    }
    public static int h(Node root){
       if(root==null) return 0;
       int hl=h(root.left);
       int hr=h(root.right);
       return Math.max(hl,hr)+1;

    }
    public static int d(Node root){
        if(root==null) return 0;
        int d9=d(root.left);
        int d2=d(root.right);
        int d3=h(root.left)+h(root.right)+1;
        return Math.max(d3,Math.max(d9,d2));
    }
    static class Trees{
        int h1;
        int d1;
        Trees(int h1,int d1){
            this.h1=h1;
            this.d1=d1;
        }
    }
    public static Trees d8(Node root){
        if(root==null) return new Trees(0,0);
        Trees left=d8(root.left);
        Trees right=d8(root.right);
        int h2=Math.max(left.h1,right.h1)+1;
        int d4=left.d1;
        int d5=right.d1;
        int d6=left.h1+right.h1+1;
        int d7=Math.max(d6,Math.max(d4,d5));
        Trees y=new Trees(h2,d7);
        return y;//5


    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT tree=new BT();
        Node root=tree.buildtree(nodes);
        System.out.println(root.data+" ");
        System.out.println(cn(root));
        System.out.println(sn(root));
        System.out.println(h(root));
        //System.out.println(d(root));
        System.out.println(d8(root).d1);
        
        
    }
}
