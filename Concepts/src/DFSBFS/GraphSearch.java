package DFSBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Graph{
    class Node{
        int data;
        LinkedList<Node> adjacent;//인접한 노드
        boolean marked;//방문여부
        Node (int data){
            this.data = data;
            this.marked = false;
            adjacent = new LinkedList<>();
        }
    }
    Node[] nodes;
    Graph(int size){
        nodes = new Node[size];
        for(int i = 0; i < nodes.length; i++){
            nodes[i] = new Node(i);
        }
    }
    //두 노드의 관계를 저장
    void addEdges(int i1, int i2){
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];

        if(!n1.adjacent.contains(n2)){
            n1.adjacent.add(n2);
        }
        if(!n2.adjacent.contains(n1)){
            n2.adjacent.add(n1);
        }
    }

    void dfs(){
        dfs(0);
    }

    void dfs(int index){
        Node root = nodes[index];
        Stack<Node> stack = new Stack<>();

        stack.push(root);
        root.marked = true;
        while(!stack.isEmpty()){
            Node r = stack.pop();
            for(Node n : r.adjacent){
                if(n.marked == false){
                    n.marked = true;
                    stack.push(n);
                }
            }
            visit(r);
        }
    }

    void dfsR(Node r){
        if(r == null){
            return;
        }

        r.marked = true;
        visit(r);

        //호출이 되지 않은 자식들 호출
        for(Node n : r.adjacent){
            if(n.marked == false){
                dfsR(n);
            }
        }
    }

    void dfsR(int index){
        Node root = nodes[index];
        dfsR(root);
    }

    void dfsR(){
        dfsR(0);
    }

    void bfs(){
        bfs(0);
    }

    void bfs(int index){
        Node root = nodes[index];
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        root.marked = true;
        while(!queue.isEmpty()){
            Node poll = queue.poll();
            for(Node r: poll.adjacent){
                if(r.marked == false){
                    r.marked = true;
                    queue.add(r);
                }
            }
            visit(poll);
        }
    }

    void visit(Node n){
        System.out.print(n.data + " ");
    }
}

/**
 *    0
 *   /
 *  1 -- 3    7
 *  |   /  \ /
 *  | /     5
 *  2 -- 4   \
 *            6 -- 8
 */
public class GraphSearch {
    public static void main(String[] args) {
        Graph g = new Graph(9);
        g.addEdges(0, 1);
        g.addEdges(1, 2);
        g.addEdges(1, 3);
        g.addEdges(2, 4);
        g.addEdges(2, 3);
        g.addEdges(3, 4);
        g.addEdges(3, 5);
        g.addEdges(5, 6);
        g.addEdges(5, 7);
        g.addEdges(6, 8);

        //g.dfs();
        g.bfs();
    }
}
