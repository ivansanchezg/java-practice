package com.ivansanchezg.search;

import java.util.Stack;

public class DepthFirstSearch {
    private DepthFirstSearch() {}

    public static boolean search(Graph graph, int searchValue) {
        graph.resetGraph();
        if(graph.count() > 0) {
            Node node = graph.getNodes().get(0);
            return search(node, searchValue);
        }
        return false;
    }

    public static boolean search(Graph graph, int startNodeValue, int searchValue) {
        graph.resetGraph();
        Node node = graph.getNode(startNodeValue);
        if(node != null) {
            return search(node, searchValue);
        }
        return false;
    }

    private static boolean search(Node node, int searchValue) {
        Stack<Node> stack = new Stack<Node>();
        stack.push(node);
        while(!stack.isEmpty()) {
            Node temp = stack.pop();
            if(!temp.isVisited()) {
                if(temp.getData() == searchValue) {
                    return true;
                }
                temp.visit();   
                for(Node neighbor : temp.getNeighbors()) {
                    stack.push(neighbor);
                }
            }
        }
        return false;
    }

    public static boolean searchRecursive(Graph graph, int startNodeValue, int searchValue) {
        graph.resetGraph();
        Node node = graph.getNode(startNodeValue);
        if(node != null) {
            return searchRecursive(node, searchValue);
        }
        return false;
    }

    public static boolean searchRecursive(Graph graph, int searchValue) {
        graph.resetGraph();
        if(graph.count() > 0) {
            Node node = graph.getNodes().get(0);
            return searchRecursive(node, searchValue);
        }
        return false;
    }

    private static boolean searchRecursive(Node node, int searchValue) {
        if(node.getData() == searchValue) {
            return true;
        }
        node.visit();
        for(Node neighbor : node.getNeighbors()) {
            if(!neighbor.isVisited()) {
                if(searchRecursive(neighbor, searchValue)) {
                    return true;
                }
            }
        }
        return false;
    }
}