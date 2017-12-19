package com.ivansanchezg.search;

import java.util.LinkedList;

public class BreadthFirstSearch {
    private BreadthFirstSearch() {}

    public static boolean search(Graph graph, int startNodeValue, int searchValue) {
        graph.resetGraph();
        Node node = graph.getNode(startNodeValue);
        if(node != null) {
            return search(node, searchValue);
        }
        return false;
    }

    public static boolean search(Graph graph, int searchValue) {
        graph.resetGraph();
        if(graph.count() > 0) {
            Node node = graph.getNodes().get(0);
            return search(node, searchValue);
        }
        return false;
    }
    
    private static boolean search(Node node, int value) {
        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(node);

        while(!queue.isEmpty()) {
            Node temp = queue.remove();
            temp.visit();
            if(temp.getData() == value) {
                return true;
            }
            for(int i = 0; i < temp.getNeighbors().size(); i++) {
                if(!temp.getNeighbors().get(i).isVisited()) {
                    queue.add(temp.getNeighbors().get(i));
                }
            }
        }
        return false;
    }
}
