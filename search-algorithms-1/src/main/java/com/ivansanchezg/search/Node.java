package com.ivansanchezg.search;

import java.util.List;
import java.util.ArrayList;

public class Node {
    public ArrayList<Node> neighbors;
    private boolean visited;
    private int data;

    public Node(int data) {
        this.data = data;
        this.visited = false;
        neighbors = new ArrayList<Node>();
    }

    public boolean isVisited() {
        return visited;
    }

    public void visit() {
        visited = true;
    }

    public void reset() {
        visited = false;
    }

    public int getData() {
        return data;
    }

    public void addNeighbor(Node node) {
        neighbors.add(node);
    }

    public List<Node> getNeighbors() {
        return neighbors;
    }
}