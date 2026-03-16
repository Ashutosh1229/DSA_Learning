package Graphs;

import java.util.ArrayList;
import java.util.List;

public class DFSGraph {
    public static void main(String[] args) {
        List<List<Integer>> graph = buildGraph();
        System.out.println(DFS(graph));
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

    private static  List<Integer> DFS(List<List<Integer>> graph){
        boolean[] visArray = new boolean[graph.size()];
        int startNode = 1;
        List<Integer> res = new ArrayList<>();
        performDFS(visArray, startNode, res, graph);
        return res;
    }

    private static void performDFS(boolean[] visArray, int startNode, List<Integer> res, List<List<Integer>> graph){
        visArray[startNode] = true;
        res.add(startNode);
        for(int i: graph.get(startNode)){
            if(!visArray[i]){
                performDFS(visArray, i, res, graph);
            }
        }
    }
}
