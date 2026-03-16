package Graphs;

import java.util.ArrayList;
import java.util.List;


public class DFSGraphWithExplanation {
    public static void main(String[] args) {
        List<List<Integer>> graph = buildGraph();
        System.out.println(initiateDFS(graph));
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

    // we are going to use recursion to achieve DFS
    // So we will create 2 methods, 1 to initiate the DFS and other 1 to perform recursion

    private static List<Integer> initiateDFS(List<List<Integer>> graph){
        // visited Array: to maintain a record of visited nodes to avoid re-traversal.
        // Response Array: since we are using recursion, the response array will be a part of parameters so that it can be updated and returned
        // Start node: to decide from where do we need to start traversing

        boolean[] visArr = new boolean[graph.size()];
        List<Integer> res = new ArrayList<>();

        //initiating the starting point
        int start = 1;
        visArr[start] = true;

        performDFS(visArr, start, graph, res);

        return res;

    }

    // holds the recursion logic of DFS
    private static void performDFS(boolean[] visArr, int start, List<List<Integer>> graph, List<Integer> res){

        // since before recursion we already check if the node is not in visited array, hence adding it to response
        // and updating the visited array
        visArr[start] = true;
        res.add(start);

        // iteratively checks if the adjacent node is visited or not.
        // if the adjacent node is not visited then we call the recursion to add it to response and update visited array
        for(int i: graph.get(start)){
            if(!visArr[i]){
                performDFS(visArr, i, graph, res);
            }
        }
    }
}
