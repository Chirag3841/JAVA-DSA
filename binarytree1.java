import java.util.LinkedList;
import java.util.Queue;

public class BT{
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
    static class BT1{
        static int idx=-1;
        public static Node buildTree(int nodes[]){    //  1   
            idx++;                                    //  / \
            if(nodes[idx]==-1) return null;           //  2  3
            Node x=new Node(nodes[idx]);               // /\   \
            x.left=buildTree(nodes);                   // 4 5   6
            x.right=buildTree(nodes);
            return x;
        }
    }
    public static void levelorder(Node root){
        Queue<Node> q=new LinkedList<>();
        if(root==null){
            return ;
        }
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node c=q.remove();
            if(c==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
            else{
                System.out.println(c.data+" ");
                if(c.left!=null){
                    q.add(c.left);
                }
                if(c.right!=null){
                    q.add(c.right);
            }
        }

    }
    }
    /*public static void preorder(Node root){
        if (root==null) return ;
        System.out.print(root.data+" ");// preorder o(n)
        preorder(root.left);
        //System.out.print(root.data+" ");// inorder
        preorder(root.right);
        //System.out.print(root.data+" "); postorder
    }/* */
    public static void main(String[] args) {
        int nodes []={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT1 tree=new BT1();
        Node root=tree.buildTree(nodes);
        //System.out.println(root.data);
        levelorder(root);
        //preorder(root);
    }
}
