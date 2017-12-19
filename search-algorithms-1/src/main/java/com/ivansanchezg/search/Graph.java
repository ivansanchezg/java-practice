package com.ivansanchezg.search;

import java.util.List;
import java.util.ArrayList;

public class Graph {
    private List<Node> nodes;

    public Graph() {
        nodes = new ArrayList<Node>();
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public Node getNode(int data) {
        for(Node node : nodes) {
            if(node.getData() == data) {
                return node;
            }
        }
        return null;
    }

    public int count() {
        return nodes.size();
    }

    public void add(Node node) {
        nodes.add(node);
    }

    public void connectNodes(Node nodeA, Node nodeB) {
        nodeA.addNeighbor(nodeB);
        nodeB.addNeighbor(nodeA);
    }

    public void connectNodes(int valueA, int valueB) {
        Node nodeA = getNode(valueA);
        Node nodeB = getNode(valueB);
        if(nodeA != null && nodeB != null) {
            connectNodes(nodeA, nodeB);
        }
    }

    public void resetGraph() {
        for(Node node : nodes) {
            node.reset();
        }
    }
}