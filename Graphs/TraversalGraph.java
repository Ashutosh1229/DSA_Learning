package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TraversalGraph {
    public static void main(String[] args) {
        List<List<Integer>> graph = buildGraph();
        System.out.println(BFS(graph));
        System.out.println(DFS(graph));
    }

    private static List<Integer> BFS(List<List<Integer>> graph) {
        List<Integer> res = new ArrayList<>();
        boolean[] vis = new boolean[graph.size()];
        Queue<Integer> q = new LinkedList<>();

        vis[1] = true;
        q.add(1);

        while (!q.isEmpty()){
            Integer node = q.poll();
            res.add(node);

            for(Integer i: graph.get(node)){
                if(!vis[i]){
                    q.add(i);
                    vis[i] = true;
                }
            }
        }
        return res;
    }

    private static List<Integer> DFS(List<List<Integer>> graph) {
        boolean[] vis = new boolean[graph.size()];
        List<Integer> res = new ArrayList<>();

        Integer node = 1;

        performDFS(node,graph, res, vis);
        return res;
    }

    static private void performDFS(Integer node, List<List<Integer>> graph,
                                            List<Integer> res, boolean[] vis){
        res.add(node);
        vis[node] = true;

        for (Integer i: graph.get(node)){
            if(!vis[i]){
                performDFS(i,graph,res,vis);
            }
        }
    }


    private static List<List<Integer>> buildGraph(){
        return List.of(
                List.of(),
                List.of(2,3),
                List.of(1,5,6),
                List.of(1,4,7),
                List.of(3,8),
                List.of(2),
                List.of(2),
                List.of(3,8),
                List.of(4,7)
        );
    }


}
