package NLTG;
public class Mainn {
    public static void main(String[] args) {
        // Linked List
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Linked List:");
        list.printList();

        // Binary Tree
        Tree tree = new Tree();
        tree.add(50);
        tree.add(30);
        tree.add(70);
        tree.add(20);
        tree.add(40);
        tree.add(60);
        tree.add(80);
        System.out.println("\nBinary Tree (Inorder Traversal):");
        tree.inorderTraversal();

        // Graph with Dijkstra
        Graph graph = new Graph();
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 1);
        graph.addEdge(2, 1, 2);
        graph.addEdge(1, 3, 1);
        graph.addEdge(2, 3, 5);
        System.out.println("\nGraph (Dijkstra's Shortest Path from Node 0):");
        graph.dijkstra(0);
    }
}
