package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSGraph {
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
        List<Integer> res = new ArrayList<>(graph.size());
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visArray = new boolean[graph.size()];
        queue.add(1);
        visArray[1] = true;

        while(!queue.isEmpty()){
            Integer node = queue.poll();
            res.add(node);

            for(Integer i: graph.get(node)){
                if(!visArray[i]){
                    queue.add(i);
                    visArray[i] = true;
                }
            }
        }

        return res;
    }
}
