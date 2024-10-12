import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Graph{
    static class Edge{
        int s;
        int d;
        //int w;
        Edge(int s,int d){
            this.s=s;
            this.d=d;
           // this.w=w;
        }
    }
    public static void cg(ArrayList<Edge>g[]){
        for(int i=0;i<g.length;i++){
            g[i]=new ArrayList<Edge>();

        }
        g[2].add(new Edge(2,3));
        g[3].add(new Edge(3,1));
        g[4].add(new Edge(4,0));
        g[4].add(new Edge(4,1));
        g[5].add(new Edge(5,0));
        g[5].add(new Edge(5,2));
        /*g[0].add(new Edge(0,2));
        g[1].add(new Edge(1,0));
        g[2].add(new Edge(2,3));
        g[3].add(new Edge(3,1));
        /*g[0].add(new Edge(0, 1));
        g[0].add(new Edge(0,2));
        g[1].add(new Edge(1,2));
        g[1].add(new Edge(1,3));
        g[2].add(new Edge(2,0));
        g[2].add(new Edge(2,4));
        g[3].add(new Edge(3,1));
        g[3].add(new Edge(3,4));
        g[3].add(new Edge(3,5));
        g[4].add(new Edge(4,2));
        g[4].add(new Edge(4,5));
        g[5].add(new Edge(5,4));
        g[5].add(new Edge(5,3));
        g[5].add(new Edge(5,6));
        g[6].add(new Edge(6,5));
       /*g[0].add(new Edge(0, 2,2));
        g[1].add(new Edge(1, 2,10));
        g[1].add(new Edge(1, 3,0));
        g[2].add(new Edge(2, 0,2));
        g[2].add(new Edge(2, 1,10));
        g[2].add(new Edge(2, 3,-1));
        g[3].add(new Edge(3, 1,0));
        g[3].add(new Edge(3, 2,-1));
    }/* */
    }
    public static void bfs(ArrayList<Edge>g[],int V,boolean v[],int start){// same as level order in Bt
        Queue<Integer>q=new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int c=q.remove();
            if(v[c]==false){
                System.out.println(c);
                v[c]=true;
                for(int i=0;i<g[c].size();i++){
                    Edge e=g[c].get(i);
                    q.add(e.d);
                }
            }
        }

    }
    public static void dfs(ArrayList<Edge>g[],int c,boolean v[]){
        System.out.println(c);
        v[c]=true;
        for(int i=0;i<g[c].size();i++){
            Edge e=g[c].get(i);
            if(v[e.d]==false)
            dfs(g,e.d,v);
        }
    }
    public static void dfs1(ArrayList<Edge>g[],int c,boolean v[],String p,int t){
        if(c==t){
            System.out.println(p);
            return;
        }
        for(int i=0;i<g[c].size();i++){
            Edge e=g[c].get(i);
            if(!v[e.d]){
                v[c]=true;
                dfs1(g,e.d,v,p+e.d,t);
                v[c]=false;
            }

        }
    }
    public static boolean Cyclic(ArrayList<Edge>g[],boolean v[],int c,boolean r[]){
        v[c]=true;
        r[c]=true;
        for(int i=0;i<g[c].size();i++){
            Edge e=g[c].get(i);
            if(r[e.d]) {
                return true;
            }
            else if(!v[e.d]){
               if(Cyclic(g,v,e.d,r));
               return true;
            }
        }
        r[c]=false;
        return false;

    }
    public static void tsu(ArrayList<Edge>g[],boolean v[],int c,Stack<Integer>s){
        v[c]=true;
        for(int i=0;i<g[c].size();i++){
            Edge e=g[c].get(i);
            if(!v[e.d]){
                tsu(g,v,e.d,s);
            }
    }
        s.push(c);
}
    public static void ts(ArrayList<Edge>g[],int V){
        boolean v[]=new boolean[V];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<V;i++){
            if(v[i]==false){
                tsu(g,v,i,s);
            }
        }
        while(!s.isEmpty()){
            System.out.println(s.pop()+" ");
        }
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge> e=new ArrayList<>();
        //cg(g);
    }
        /*boolean v[]=new boolean[V];
        boolean r[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(v[i]==false){
                boolean iscycle=Cyclic(g, v, 0, r);
                if(iscycle){
                    System.out.println(iscycle);
                    break;
                }
            }
        }
        
        /*int s=0;
        int t=5;
        dfs1(g,s,new boolean[V],"0",t);
       /*  for(int i=0;i<V;i++){// if it is disconnected graph
            if(v[i]==false){
                dfs1(g,0,v,p,5);
            }
        }/* */
        //bfs(g,V);
        //dfs(g,0,v);
        System.out.println();/* */
        //for(int i=0;i<g[2].size();i++){
            //Edge e=g[2].get(i);
            //System.out.println(e.d+" ");
            //System.out.println(e.w+" ");
        }
        
    }
