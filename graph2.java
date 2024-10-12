mport java.util.*;
class Graph1{
    static class Edge{
        int s;
        int d;
        //int w;
        Edge(int s,int d){
            this.s=s;
            this.d=d;
            //this.w=w;
        }
    }
    public static void cg(ArrayList<Edge>g[]){
        for(int i=0;i<g.length;i++){
            g[i]=new ArrayList<Edge>();
        }
        g[0].add(new Edge(0, 1));
        g[0].add(new Edge(0, 2));
        g[0].add(new Edge(0, 3));
        g[1].add(new Edge(1, 0));
        g[1].add(new Edge(1, 2));
        g[2].add(new Edge(2, 0));
        g[2].add(new Edge(2, 1));
        g[3].add(new Edge(3, 0));
        g[3].add(new Edge(3, 4));
        g[4].add(new Edge(4, 3));
        /*g[0].add(new Edge(0, 1));
        g[0].add(new Edge(0, 2));
        g[0].add(new Edge(0, 3));
        g[1].add(new Edge(1, 0));
        g[1].add(new Edge(1, 2));
        g[2].add(new Edge(2, 0));
        g[2].add(new Edge(2, 1));
        g[3].add(new Edge(3, 0));
        g[3].add(new Edge(3, 4));
        g[3].add(new Edge(3, 5));
        g[4].add(new Edge(4, 3));
        g[4].add(new Edge(4, 5));
        g[5].add(new Edge(5, 3));
        g[5].add(new Edge(5, 4));
        /*g[0].add(new Edge(0, 2));
        g[0].add(new Edge(0, 3));
        g[1].add(new Edge(1, 0));
        g[2].add(new Edge(2, 1));
        g[3].add(new Edge(3, 4));/* */
        /*g[0].add(new Edge(0,1,10));
        g[0].add(new Edge(0,2,15));
        g[0].add(new Edge(0,3,30));
        g[1].add(new Edge(1,0,10));
        g[1].add(new Edge(1,3,40));
        g[2].add(new Edge(2,0,15));
        g[2].add(new Edge(2,3,50));
        g[3].add(new Edge(3,1,40));
        g[3].add(new Edge(3,2,50));
        /*g[0].add(new Edge(0,1,2));
        g[0].add(new Edge(0,2,4));
        g[1].add(new Edge(1,2,-4));
        g[2].add(new Edge(2,3,2));
        g[3].add(new Edge(3,4,4));
        g[4].add(new Edge(4,1,-1));
    }
    public static void BellmanFord(ArrayList<Edge>g[],int s,int V){
        int dist[]=new int[V];
        for(int i=0;i<V;i++){
            if(i!=s){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        for(int k=0;k<V-1;k++){
            for(int i=0;i<V;i++){
                for(int j=0;j<g[i].size();j++){
                    Edge e=g[i].get(j);
                    int u=e.s;
                    int v=e.d;
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+e.w<dist[v]){
                        dist[v]=dist[u]+e.w;
                    }
                }
            }
        }
        for(int i=0;i<V;i++){
            System.out.println(dist[i]+" ");
        }
        System.out.println();// 0 2 -2 0 4
        
    }/* */
    }
    public static void dfs4(ArrayList<Edge> g[],int c,boolean v[],int dt[],int l[],int t1,int p,boolean ap[]){
        v[c]=true;
        dt[c]=l[c]=++t1;
        int child=0;
        for(int i=0;i<g[c].size();i++){
            Edge e=g[c].get(i);
            if(e.d==p){//already parent
                continue;
            }else if(v[e.d]){// backedge & ancestor
                l[c]=Math.min(l[c], dt[e.d]);
            }else{// not visited
                dfs4(g, e.d, v, dt, l, t1, c, ap);
                l[c]=Math.min(l[c], l[e.d]);
                if(dt[c]<=l[e.d] && p!=-1){// atriculation pt 
                    ap[c]=true;
                }
                child++;

            }
        }
        if(p==-1 && child>1){// ap too 
            ap[c]=true;
        }

    }
    public static void AP(ArrayList<Edge> g[],int V){
        int dt[]=new int[V];
        int l[]=new int[V];
        int t1=0;
        boolean v[]=new boolean[V];
        boolean ap[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!v[i]){
                dfs4(g, i, v, dt, l, t1, -1, ap);
            }
        }
        for(int i=0;i<V;i++){
            if(ap[i]){
                System.out.println(i);// 0 and 3 
            }
        }

    }
    /*public static void dfs3(ArrayList<Edge>g[],int c,boolean v[],int dt[],int l[],int t1,int p){
        v[c]=true;
        dt[c]=l[c]=++t1;
         for(int i=0;i<g[c].size();i++){
            Edge e=g[c].get(i);
            if(e.d==p) continue;
            else if(!v[e.d]){
                dfs3(g, e.d, v, dt, l, t1, c);
                l[c]=Math.min(l[c],l[e.d]);
                if(dt[c]<l[e.d]){
                    System.out.println("bridge " +c+ "---------" +e.d);// 0 to 3
                }
            }else{
                l[c]=Math.min(l[c],dt[e.d]);
            }
        }

    }
    public static void bridgetarjan(ArrayList<Edge>g[],int V){
        int dt[]=new int[V];
        int l[]=new int[V];
        int t1=0;
        boolean v[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!v[i]){
                dfs3(g,i,v,dt,l,t1,-1);
            }
        }

    }
    /*public static void tsu(ArrayList<Edge>g[],boolean v[],int c,Stack<Integer>s){
        v[c]=true;
        for(int i=0;i<g[c].size();i++){
            Edge e=g[c].get(i);
            if(!v[e.d]){
                tsu(g,v,e.d,s);
            }
        }
        s.push(c);
    }
    public static void dfs2(ArrayList<Edge>g[],boolean v[],int c){
        v[c]=true;
        System.out.println(c+" ");
        for(int i=0;i<g[c].size();i++){
            Edge e=g[c].get(i);
            if(!v[e.d]){
                dfs2(g,v,e.d);
            }
        }
    }

    public static void Kosaraju(ArrayList<Edge>g[],int V){
        Stack<Integer> s=new Stack<>();
        boolean v[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!v[i]){
                tsu(g,v,i,s);
            }
        }
        ArrayList<Edge>t[]=new ArrayList[V];
        for(int i=0;i<g.length;i++){
            v[i]=false;
            t[i]=new ArrayList<Edge>();
        }
        for(int i=0;i<V;i++){
            for(int j=0;j<g[i].size();j++){
                Edge e=g[i].get(j);
                t[e.d].add(new Edge(e.d, e.s));// reverse direction

            }
        }
        while(!s.isEmpty()){
            int c=s.pop();
            if(!v[c]){
                dfs2(g,v,c);
            }
        }
    }

    /*public static class pair implements Comparable<pair>{
        int node;
        int cost;
        pair(int n,int c){
            this.node=n;
            this.cost=c;
        }
        @Override
        public int compareTo(pair p){
            return this.cost-p.cost;
        }

    }
    public static void Prim(ArrayList<Edge>g[],int V){
        PriorityQueue<pair> pq=new PriorityQueue<>();
        boolean v[]=new boolean[V];
        pq.add(new pair(0,0));
        int cost1=0;
        while(!pq.isEmpty()){
            pair r=pq.remove();
            if(!v[r.node]){
                v[r.node]=true;
                cost1+=r.cost;
                for(int i=0;i<g[r.node].size();i++){
                    Edge e=g[r.node].get(i);
                    if(!v[e.d]){
                        pq.add(new pair(e.d,e.w));
                    }
                }
            }
        }
        System.out.println(cost1);//55
    }/* */
    
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge>g[]=new ArrayList[V];
        cg(g);
        //Kosaraju(g, V);
        //Prim(g,V);
        //BellmanFord(g, 0, V);
        //bridgetarjan(g, V);
        AP(g,V);
    }
}
