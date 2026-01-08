import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class BFSDFS {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[],int vertices) {
        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void bfs(ArrayList<Edge> graph[],int vertices,boolean visited[],int start) {
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(start);

        while (!queue.isEmpty()) {
            int curr = queue.remove();

            if(visited[curr] == false) {
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                queue.add(e.dest);
                }
            }  
        }
    }

    public static void dfs(ArrayList<Edge> graph[],boolean visited[],int curr) {
        System.out.print(curr + " ");
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(visited[e.dest] == false) {
                dfs(graph, visited, e.dest);
            }
        }
    }
    

    public static void main(String[] args) {
        int vertices = 7;
        ArrayList<Edge> graph[] = new ArrayList[vertices];
        createGraph(graph,vertices);

        boolean visited[] = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            if(visited[i] == false) {
                bfs(graph,vertices,visited,i);
            }
        }
        
        System.out.println();
        for (int i = 0; i < vertices; i++) {
            visited[i] = false;
        }
        for (int i = 0; i < vertices; i++) {
            if(visited[i] == false) {
                dfs(graph,visited,i);
            }
        }
    }
}
