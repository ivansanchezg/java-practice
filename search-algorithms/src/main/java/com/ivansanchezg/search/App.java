package com.ivansanchezg.search;

public class App 
{
    public static void main( String[] args )
    {
        int[] array = new int[]{-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10};
        System.out.println(BinarySearch.search(array, -5));
        System.out.println(BinarySearch.search(array, -3));
        System.out.println(BinarySearch.search(array, -2));
        System.out.println(BinarySearch.search(array, 0));
        System.out.println(BinarySearch.search(array, 1));
        System.out.println(BinarySearch.search(array, 5));
        System.out.println(BinarySearch.search(array, 7));
        System.out.println(BinarySearch.search(array, 10));
        System.out.println(BinarySearch.search(array, 20));

        Graph graph = new Graph();
        graph.add(new Node(10));
        graph.add(new Node(20));
        graph.add(new Node(30));
        graph.add(new Node(40));
        graph.add(new Node(50));
        graph.add(new Node(60));
        graph.add(new Node(70));
        graph.add(new Node(80));
        graph.connectNodes(10, 20);
        graph.connectNodes(10, 30);
        graph.connectNodes(10, 40);
        graph.connectNodes(20, 30);
        graph.connectNodes(20, 60);
        graph.connectNodes(20, 70);
        graph.connectNodes(40, 50);
        graph.connectNodes(40, 60);
        graph.connectNodes(50, 80);
        graph.connectNodes(70, 80);

        System.out.println(BreadthFirstSearch.search(graph, 10, 60));
        System.out.println(BreadthFirstSearch.search(graph, 40, 90));
        System.out.println(BreadthFirstSearch.search(graph, 70));

        System.out.println(DepthFirstSearch.search(graph, 10, 60));
        System.out.println(DepthFirstSearch.search(graph, 10, 90));
        System.out.println(DepthFirstSearch.search(graph, 70));
        System.out.println(DepthFirstSearch.searchRecursive(graph, 10, 60));
        System.out.println(DepthFirstSearch.searchRecursive(graph, 10, 90));
        System.out.println(DepthFirstSearch.searchRecursive(graph, 70));
    }
}
