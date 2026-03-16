package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSGraphWithExplanation {
    public static void main(String[] args) {
        List<List<Integer>> graph = buildGraph();
        System.out.println(BFS(graph));
    }

    private static List<List<Integer>> buildGraph(){
        return List.of(
                List.of(),
                List.of(2,3),
                List.of(1,3,4),
                List.of(2),
                List.of(2,5),
                List.of(4,8),
                List.of(1,7,9),
                List.of(6,8),
                List.of(5,7),
                List.of(6)
        );
    }

    private static List<Integer> BFS(List<List<Integer>> graph){
        // queue : to store the adjacent notes
        // visited array : to avoid re-traversing the same node
        // * use boolean and not Boolean to avoid NPE since Boolean is non-primitive and hence allows null value
        // response: BFSed array

        Queue<Integer> nodeQ = new LinkedList();
        boolean[] visArr = new boolean[graph.size()];
        List<Integer> res = new ArrayList<>();

        // initialize the starting node
        nodeQ.add(6); // since our code uses Queue to identify adjacent node and then traverse, hence the starting node needs to be pushed first
        visArr[6] = true; // since we are starting with that node, we must mark it as visited during initialization only

        // algo
        while(!nodeQ.isEmpty()){
            // get the first element in Queue and add it to the response since we already checked below if it's not visited
            Integer node = nodeQ.poll();
            res.add(node);

            // get all the adjacent nodes of the current selected element and iteratively check if any of it's adjacent node is not visited
            // in case we find any adjacent not visited node, we push it to the Queue so that it can be added to the response
            for(int i: graph.get(node)){
                if(!visArr[i]){
                    nodeQ.add(i);
                    visArr[i] = true;
                }
            }

        }

        return res;
    }
}
